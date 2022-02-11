package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hotel1 extends AppCompatActivity {

    TextView user1;
    Button back, book;
    EditText guests, nights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel1);

        user1 = findViewById(R.id.user2);
        back = findViewById(R.id.back1);
        book = findViewById(R.id.booknow1);
        guests = findViewById(R.id.noguests1);
        nights = findViewById(R.id.nonights1);

        Intent intent5 = getIntent();
        String userID = intent5.getStringExtra("id");
        user1.setText(userID);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(hotel1.this, Hotels.class);
                intent6.putExtra("id", user1.getText().toString());
                startActivity(intent6);
            }
        });

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!guests.getText().toString().equals("") && !nights.getText().toString().equals("")
                && !guests.getText().toString().equals("0") && !nights.getText().toString().equals("0")){
                    Intent intent7 = new Intent(hotel1.this, booknow.class);
                    intent7.putExtra("id", user1.getText().toString());
                    intent7.putExtra("guests", guests.getText().toString());
                    intent7.putExtra("nights", nights.getText().toString());
                    intent7.putExtra("cost", "$" + Integer.parseInt(nights.getText().toString()) * 100);
                    startActivity(intent7);
                } else {
                    guests.setText("");
                    nights.setText("");
                }
            }
        });

    }
}