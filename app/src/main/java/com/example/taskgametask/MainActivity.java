package com.example.taskgametask;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button start;
   private EditText word;
   private EditText clue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.button2);
        word=(EditText) findViewById(R.id.editTextTextPersonName2);
        clue=(EditText)findViewById(R.id.editTextTextPersonName3);
        start.setOnClickListener(view -> {
String ans=word.getText().toString().toUpperCase();
String hints=clue.getText().toString();
Intent intent =new Intent(MainActivity.this,game.class);
intent.putExtra("Word",ans);
intent.putExtra("Clue",hints);
startActivity(intent);
        });

    }
}