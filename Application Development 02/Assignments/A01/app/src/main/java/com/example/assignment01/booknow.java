package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class booknow extends AppCompatActivity {

    Button home, paynow;
    TextView user3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booknow);

        home = findViewById(R.id.back);
        paynow = findViewById(R.id.button);
        user3 = findViewById(R.id.user4);

        Intent intent11 = getIntent();
        String userID = intent11.getStringExtra("id");
        user3.setText(userID);

        String amount = intent11.getStringExtra("cost");
        paynow.setText("Please, pay " + amount);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent11 = new Intent(booknow.this, Hotels.class);
                intent11.putExtra("id", user3.getText().toString());
                startActivity(intent11);
            }
        });

        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


    }
}