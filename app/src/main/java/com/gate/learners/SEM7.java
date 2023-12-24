package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7);
    }
    public void art_intel(View v){
        Intent jump1 = new Intent(SEM7.this,ART_INTEL.class);
        startActivity(jump1);
    }
    public void d_compute(View v){
        Intent jump2 = new Intent(SEM7.this,DIS_COMPUTING.class);
        startActivity(jump2);
    }
    public void elective7(View v){
        Intent jump3 = new Intent(SEM7.this,ELECTIVE.class);
        startActivity(jump3);
    }
    public void pro_1(View v){
        Intent jump4 = new Intent(SEM7.this,PROJECT1.class);
        startActivity(jump4);
    }
    public void i_train(View v){
        Intent jump4 = new Intent(SEM7.this,IND_TRAINING.class);
        startActivity(jump4);
    }
}
