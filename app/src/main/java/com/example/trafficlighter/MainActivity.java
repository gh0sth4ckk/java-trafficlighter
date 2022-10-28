package com.example.trafficlighter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout main = findViewById(R.id.main);

        Button red_btn = findViewById(R.id.red_btn);
        Button yellow_btn = findViewById(R.id.yellow_btn);
        Button green_btn = findViewById(R.id.green_btn);

        red_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.RED);
            }
        });

        yellow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.YELLOW);
            }
        });

        green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.GREEN);
            }
        });
    }
}