package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button mainPageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.loginID);
        password = findViewById(R.id.Password);
        mainPageBtn = findViewById(R.id.LoginButton);

        mainPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("sakku") &&
                        password.getText().toString().equals("password")) {
                    Intent intent = new Intent(MainActivity.this, Hotels.class);
                    intent.putExtra("id", username.getText().toString());
                    startActivity(intent);
                } else {
                    username.setText("");
                    password.setText("");
                    Toast.makeText(getApplicationContext(),"Incorrect ID or password. Try again.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}