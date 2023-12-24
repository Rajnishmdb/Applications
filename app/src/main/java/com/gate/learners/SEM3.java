package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
        }
    public void analog(View v){
        Intent jump1 = new Intent(SEM3.this,ANALOG.class);
        startActivity(jump1);
    }
    public void structure(View v){
        Intent jump2 = new Intent(SEM3.this,DATA_STRUCTURE.class);
        startActivity(jump2);
    }
    public void oops(View v){
        Intent jump3 = new Intent(SEM3.this,OOPS.class);
        startActivity(jump3);
    }
    public void math3(View v){
        Intent jump4 = new Intent(SEM3.this,MATH3.class);
        startActivity(jump4);
    }
    public void writing(View v){
        Intent jump5 = new Intent(SEM3.this,T_WRITING.class);
        startActivity(jump5);
    }
    public void intern1(View v){
        Intent jump6 = new Intent(SEM3.this,INTERNSHIP_1.class);
        startActivity(jump6);
    }

}
