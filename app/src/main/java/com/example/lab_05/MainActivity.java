package com.example.lab_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText userName;
    EditText userEmail;
    EditText userPW;


    EditText savedName;
    EditText savedEmail;
    EditText savedPW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submitButton);
        userName = findViewById(R.id.inputName);
        userPW = findViewById(R.id.inputPassword);
        userEmail = findViewById(R.id.inputEmail);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedName = userName;
                savedPW = userPW;
                savedEmail = userEmail;

            }
        });
    }


}
