package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Semester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
    }
    public void sem1(View v){
        Intent jump_page = new Intent(Semester.this,SEM1.class);
        startActivity(jump_page);
    }
    public void sem2(View v){
        Intent jump_page2 = new Intent(Semester.this,SEM2.class);
        startActivity(jump_page2);
    }
    public void sem3(View v){
        Intent jump_page3 = new Intent(Semester.this,SEM3.class);
        startActivity(jump_page3);
    }
    public void sem4(View v){
        Intent jump_page4 = new Intent(Semester.this,SEM4.class);
        startActivity(jump_page4);
    }
    public void sem5(View v){
        Intent jump_page5 = new Intent(Semester.this,SEM5.class);
        startActivity(jump_page5);
    }
    public void sem6(View v){
        Intent jump_page6 = new Intent(Semester.this,SEM6.class);
        startActivity(jump_page6);
    }
    public void sem7(View v){
        Intent jump_page7 = new Intent(Semester.this,SEM7.class);
        startActivity(jump_page7);
    }
    public void sem8(View v){
        Intent jump_page8 = new Intent(Semester.this,SEM8.class);
        startActivity(jump_page8);
    }
}
