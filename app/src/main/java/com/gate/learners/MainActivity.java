package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sem(View v){
        Intent page1 = new Intent(MainActivity.this,Semester.class);
        startActivity(page1);
    }
    public void gate(View v){
        Intent page2 = new Intent(MainActivity.this,GATE.class);
        startActivity(page2);
    }
}
