package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hotel2 extends AppCompatActivity {

    TextView user2;
    Button back2, book2;
    EditText guests2, nights2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);

        user2 = findViewById(R.id.user3);
        back2 = findViewById(R.id.back2);
        book2 = findViewById(R.id.booknow2);
        guests2 = findViewById(R.id.noguests2);
        nights2 = findViewById(R.id.nonights2);

        Intent intent8 = getIntent();
        String userID = intent8.getStringExtra("id");
        user2.setText(userID);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(hotel2.this, Hotels.class);
                intent9.putExtra("id", user2.getText().toString());
                startActivity(intent9);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!guests2.getText().toString().equals("") && !nights2.getText().toString().equals("")
                        && !guests2.getText().toString().equals("0") && !nights2.getText().toString().equals("0")){
                    Intent intent10 = new Intent(hotel2.this, booknow.class);
                    intent10.putExtra("id", user2.getText().toString());
                    intent10.putExtra("guests", guests2.getText().toString());
                    intent10.putExtra("nights", nights2.getText().toString());
                    intent10.putExtra("cost", "$" + Integer.parseInt(nights2.getText().toString()) * 120);
                    startActivity(intent10);
                } else {
                    guests2.setText("");
                    nights2.setText("");
                }
            }
        });
    }
}