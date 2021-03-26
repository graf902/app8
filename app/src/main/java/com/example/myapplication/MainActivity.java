package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but1;
    Button but2;
    Button but3;
    TextView TeVt;
    TextView tV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        TeVt = findViewById(R.id.textView);
        tV2 = findViewById(R.id.tV2);

      but2.setOnClickListener(numClickListener);
    }

    public void BuT1(View view) {
        TeVt.setText("Вы купили текст за 25$(это тупо)");
        tV2.getEditableText();
    }

    View.OnClickListener numClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TeVt.setText("Вы продали текст за 30$(STONKS!)");

        }
    };
}