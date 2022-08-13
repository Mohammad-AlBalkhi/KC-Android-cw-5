package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        TextView cn2 = findViewById(R.id.aa);
        TextView age2 = findViewById(R.id.ageEdit2);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        cn2.setText(name);

        int age = bundle.getInt("age");
        age2.setText(String.valueOf(age));

    }
}