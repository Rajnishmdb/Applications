package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
    }
    public void physics(View v){
        Intent jump1 = new Intent(SEM2.this,PHYSICS.class);
        startActivity(jump1);
    }
    public void math2(View v){
        Intent jump2 = new Intent(SEM2.this,MATH2.class);
        startActivity(jump2);
    }
    public void bee(View v){
        Intent jump3 = new Intent(SEM2.this,BEE.class);
        startActivity(jump3);
    }
    public void egd(View v){
        Intent jump4 = new Intent(SEM2.this,EGD.class);
        startActivity(jump4);
    }
}
