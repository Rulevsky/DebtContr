package com.example.debtcontr;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import javax.inject.Inject;

import dagger.Provides;

public class AgentModel {



    String name;
    String number;
    String money;
    String date;

    @Inject
    AppComponent appComponent;
    Context context;
    Context context1;

    public AgentModel (String name, String number, String money, String date) {
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
        AppComponent appComponent = new AppComponent() {
            @Override
            public void injectAgen(AgentModel agentModel) {
                context1 = context.getApplicationContext();
            }

            @Override
            public void injectAdd(AddAgentActivity addAgentActivity) {
                addAgentActivity.

            }


        };
        DBHelper dbHelper = new DBHelper(context);
        ContentValues cv = new ContentValues();
        Log.d("tag", "CV создан");

        SQLiteDatabase db = dbHelper.getWritableDatabase(); // пустой контекст, NullExc....

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
