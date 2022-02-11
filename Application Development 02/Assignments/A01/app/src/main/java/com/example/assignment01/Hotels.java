package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hotels extends AppCompatActivity {

    Button hotel1, hotel2;
    TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels2);

        hotel1 = findViewById(R.id.hotel1button);
        hotel2 = findViewById(R.id.hotel2button);
        user = findViewById(R.id.user);

        Intent intent2 = getIntent();
        String userID = intent2.getStringExtra("id");
        user.setText(userID);

        hotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Hotels.this, hotel1.class);
                intent3.putExtra("id", user.getText().toString());
                startActivity(intent3);
            }
        });

        hotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Hotels.this, hotel2.class);
                intent4.putExtra("id", user.getText().toString());
                startActivity(intent4);
            }
        });
    }


}