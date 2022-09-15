package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String langauge[] = {"Android","android","C  ","Go","Goa","AndroidStudio","C++","PHP"};

    AutoCompleteTextView autoCompleteTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.auto);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,langauge);
        autoCompleteTextView.setThreshold(3);
        autoCompleteTextView.setTextColor(Color.BLUE);
        autoCompleteTextView.setAdapter(arrayAdapter);


    }
}