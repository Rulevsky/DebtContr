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
        Log.d("tag", message + "Конечная точка");

    }


    void AddToDb() {

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
}
