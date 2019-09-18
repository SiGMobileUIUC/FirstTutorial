package com.example.firsttutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {
        final TextView textViewToChange = findViewById(R.id.textView);
        if (textViewToChange.getText().equals("Hello world!")) {
            textViewToChange.setText("Welcome to SIGMobile!");
        } else {
            textViewToChange.setText("Hello world!");
        }
    }
}
