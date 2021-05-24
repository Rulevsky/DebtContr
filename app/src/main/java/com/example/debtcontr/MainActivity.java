package com.example.debtcontr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAddAgent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddAgent = findViewById(R.id.btnAddAgent);

        View.OnClickListener onClickListener = v -> {
            Intent intent = new Intent(this, AddAgentActivity.class);
            startActivity(intent);
        };

        btnAddAgent.setOnClickListener(onClickListener);
    }
}