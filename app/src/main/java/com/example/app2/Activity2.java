package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    //final int MY_REQUEST_CODE = 1;
int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
        Button button = findViewById(R.id.add);
        //Button button2 = findViewById(R.id.mark);
        EditText editText = (EditText)findViewById(R.id.editTextNumber);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                startActivity(new Intent(getApplicationContext(),add.class));

            }
        });
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("value", 0);

        Log.d("value of here is ", String.valueOf(intValue));
        editText.setText(String.valueOf(intValue));





    }


/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
         EditText editText = (EditText)findViewById(R.id.editTextNumber);
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == MY_REQUEST_CODE) {
                if (data!= null)
                    editText.setText(data.getStringExtra("value"));
                Log.d("value of x is ", String.valueOf(data.getStringExtra("value")));
            }
        }
    }*/

}