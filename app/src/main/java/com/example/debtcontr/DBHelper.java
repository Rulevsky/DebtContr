//package com.example.debtcontr;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.util.Log;
//
//public class DBHelper extends SQLiteOpenHelper {
//    public static final String ID = "_id";
//    public static final String NAME = "name";
//    public static final String NUMBER = "number";
//    public static final String MONEY = "money";
//    public static final String DATE = "date";
//
//    public static final String DBNAME = "mvpsample";
//    public static final int VERSION = 1;
//
//
//    public DBHelper(Context context) {
//
//        super(context, DBNAME, null, VERSION);
//    }
//
//
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        Log.d("tag", "--- on create db ----");
//        db.execSQL("create table DBNAME ("
//                + "_id integer primary key autoincrement, "
//                + "name text,"
//                + "number text,"
//                + "money text,"
//                + "date text" + ");");
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
//
//    }
//}
//
