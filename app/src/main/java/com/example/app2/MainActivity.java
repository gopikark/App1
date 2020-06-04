package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button simpleButton1;
    Button simpleButton2;
    Button simpleButton3;
    Button simpleButton4;
    Button simpleButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleButton1 = (Button) findViewById(R.id.e1);
        simpleButton2 = (Button) findViewById(R.id.e2);
        simpleButton3 = (Button) findViewById(R.id.e3);
        simpleButton4 = (Button) findViewById(R.id.e4);
        simpleButton5 = (Button) findViewById(R.id.e5);

        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity2.class));
            }
        });
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity3.class));
            }
        });
        simpleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity4.class));
            }
        });
        simpleButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity5.class));
            }
        });
        simpleButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity6.class));
            }
        });
    }
}