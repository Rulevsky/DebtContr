package com.example.debtcontr;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class AgentModel {


   String name;
   String number;
   String money;
   String date;

   DBHelper dbHelper;





    public AgentModel(String name, String number, String money, String date) {
        this.name = name;
        this.number = number;
        this.money = money;
        this.date = date;


    }

    public void AgentModTest() {
        Log.d("tag", "AgentModel Получил данные");
        String message = name + number + money + date;

    }


    void addToDb(String name, String number, String money, String date){

        dbHelper = new DBHelper(this);
        ContentValues cv = new ContentValues();
        Log.d("tag", "CV создан");
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Log.d("tag", "--- Insert in mytable: ---");
        // подготовим данные для вставки в виде пар: наименование столбца - значение
        cv.put("NAME", name);
        cv.put("NUMBER", number);
        cv.put("MONEY", money);
        cv.put("DATE", date);
        // вставляем запись и получаем ее ID
        long rowID = db.insert("DBNAME", null, cv);
        Log.d("tag", "row inserted, ID = " + rowID);
    }

    class DBHelper extends SQLiteOpenHelper {

        public static final String ID = "_id";
        public static final String NAME = "name";
        public static final String NUMBER = "number";
        public static final String MONEY = "money";
        public static final String DATE = "date";
        public static final String DBNAME = "mvpsample";
        public static final int VERSION = 1;

        public DBHelper(Context context) {
            super(context, DBNAME, null, VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.d("tag", "--- on create db ----");
        db.execSQL("create table DBNAME ("
                + "ID integer primary key autoincrement, "
                + "NAME text,"
                + "NUMBER text,"
                + "MONEY text,"
                + "DATE text" + ");");
        }

        @Override
        public void onUpgrade(SQLiteDatabase DBNAME, int oldVersion, int newVersion) {

        }
    }
}
