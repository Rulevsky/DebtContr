package com.example.debtcontr;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.EditText;

public class AgentPresenter {


    EditText etAgentName;
    EditText etAgentNumber;
    EditText etAgentMoney;
    EditText etAgentDate;


    String name;
    String number;
    String money;
    String date;




    public AgentPresenter(String name, String number, String money, String date) {
       this.name = name;
       this.number = number;
       this.money = money;
       this.date = date;
    }

    public void AgentPrTest() {
        String message = name + number + money + date;
        Log.d("tag", message);
    }

    public void TestSendDataToModel() {
        Log.d("tag", "Презентер получил");
        AgentModel agentModel = new AgentModel(name, number, money, date);
        Log.d("tag", "Попытка записать в базу");
        agentModel.addToDb(name, number, money, date);
        Log.d("tag", "Попытка записать в базу");
        String message = name + number + money + date;

    }

    void AddToDBPresenter(String name, String number, String money, String date) {
//        AgentModel agentModel = new AgentModel();
//        AgentModel.addToDb(name, number, money, date);
        Log.d("tag", "Презентер получил данные");


    }


}
