package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);
    }
    public void chemistry(View v){
        Intent jump1 = new Intent(SEM1.this,CHEMISTRY.class);
        startActivity(jump1);
    }
    public void math1(View v){
        Intent jump2 = new Intent(SEM1.this,MATH1.class);
        startActivity(jump2);
    }
    public void program(View v){
        Intent jump3 = new Intent(SEM1.this,PROGRAM.class);
        startActivity(jump3);
    }
    public void workshop(View v){
        Intent jump4 = new Intent(SEM1.this,WORKSHOP.class);
        startActivity(jump4);
    }
    public void english(View v){
        Intent jump5 = new Intent(SEM1.this,ENGLISH.class);
        startActivity(jump5);
    }
}
