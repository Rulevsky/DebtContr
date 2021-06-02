
package com.example.debtcontr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import dagger.Module;



public class AddAgentActivity extends AppCompatActivity {
    EditText etAgentName;
    EditText etAgentNumber;
    EditText etAgentMoney;
    EditText etAgentDate;

    Button btnAdd;
    Button btnCheck;

//    @Inject
//    AppComponent appComponent;
//    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_agent);

        etAgentName = findViewById(R.id.etAgentName);
        etAgentNumber = findViewById(R.id.etAgentNumber);
        etAgentMoney = findViewById(R.id.etAgentMoney);
        etAgentDate = findViewById(R.id.etAgentDate);
        btnAdd = findViewById(R.id.btnAdd);
        btnCheck = findViewById(R.id.btnCheck);
        btnAdd.setOnClickListener(onClickListener);
        btnCheck.setOnClickListener(onClickListener);
//        context = getApplicationContext();
//        AppComponent appComponent = new AppComponent() {
//            @Override
//            public void inject(AddAgentActivity addAgentActivity) {
//                context = getApplicationContext();
//            }
//        };
//        DBHelper dbHelper = new DBHelper(context);
        Log.d("tag", "oncreate done");



    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //ContentValues cv = new ContentValues();

            String name = etAgentName.getText().toString();
            String number = etAgentNumber.getText().toString();
            String money = etAgentMoney.getText().toString();
            String date = etAgentDate.getText().toString();



            switch (v.getId()) {
                case R.id.btnAdd:

                    Log.d("tag", "Кнопка сработала");
                    AgentPresenter agentPresenter = new AgentPresenter(name, number, money, date);
                    Log.d("tag", "Экземпляр создан");
                    agentPresenter.TestSendDataToModel();



                    break;

                case R.id.btnCheck:
//                    Log.d("tag", "--- Clear mytable: ---");
//                    // удаляем все записи
//                    int clearCount = db.delete("DBNAME", null, null);
//                    Log.d("tag", "deleted rows count = " + clearCount);
//                    break;




            }
        }

    };


}