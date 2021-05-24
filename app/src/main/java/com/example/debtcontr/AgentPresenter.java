package com.example.debtcontr;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.lang.ref.WeakReference;

public class AgentPresenter {


    EditText etAgentName;
    EditText etAgentNumber;
    EditText etAgentMoney;
    EditText etAgentDate;


    String name;
    String number;
    String money;
    String date;

    Context context;


    public AgentPresenter(String name, String number, String money, String date) {
       this.name = name;
       this.number = number;
       this.money = money;
       this.date = date;
       this.context = context;
    }

    public void AgentPrTest() {
        String message = name + number + money + date;
        Log.d("tag", message);

    }

    public void TestSendDataToModel() {
        Log.d("tag", "Презентер получил");
        AgentModel agentModel = new AgentModel(name, number, money, date);
        Log.d("tag", "Попытка отправить в модел");
        agentModel.AgentModTest();



    }





}
