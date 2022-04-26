package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        output = findViewById(R.id.output);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String input = extras.getString("input");
            output.setText(input);
        }
    }
}