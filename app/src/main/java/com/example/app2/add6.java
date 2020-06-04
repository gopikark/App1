package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class add6 extends AppCompatActivity {

    private static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final EditText nameField = (EditText) findViewById(R.id.editTask);
        String name = nameField.getText().toString();

        Button button = findViewById(R.id.buttonadd);
        final EditText DiscField = (EditText) findViewById(R.id.disc);
        String email = DiscField.getText().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                ++count;
                Log.d("value of x is ", String.valueOf(count));
                int value=count;
                Intent intent = new Intent(add6.this, Activity6.class);
                intent.putExtra("value", value);
                startActivity(intent);
                //  setResult(RESULT_OK, intent);
                //   finish();
            }
        });
    }
}