package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText cn = findViewById(R.id.cnEdit);
        EditText age = findViewById(R.id.ageEdit);
        Button b1 = findViewById(R.id.b1);

     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String cnEdt = cn.getText().toString();
             int ageEdit = Integer.parseInt(age.getText().toString());
             Intent intent =new Intent(MainActivity.this, page2.class);
             intent.putExtra("name", cnEdt);
             intent.putExtra("age", ageEdit);

             startActivity(intent);




         }
     });



    }
}