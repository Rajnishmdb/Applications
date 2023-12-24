package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);
    }
    public void compiler6(View v){
        Intent jump1 = new Intent(SEM6.this,COMPILER_6.class);
        startActivity(jump1);
    }
    public void flat6(View v){
        Intent jump2 = new Intent(SEM6.this,FLAT_6.class);
        startActivity(jump2);
    }
    public void iea6(View v){
        Intent jump3 = new Intent(SEM6.this,IEA_6.class);
        startActivity(jump3);
    }
    public void ooad(View v){
        Intent jump4 = new Intent(SEM6.this,OOAD6.class);
        startActivity(jump4);
    }
    public void ppl6(View v){
        Intent jump5 = new Intent(SEM6.this,PPL_6.class);
        startActivity(jump5);
    }
    public void software_eng(View v){
        Intent jump6 = new Intent(SEM6.this,SOFT_ENGG_6.class);
        startActivity(jump6);
    }
    public void web_design(View v){
        Intent jump7 = new Intent(SEM6.this,WADD_6.class);
        startActivity(jump7);
    }
}
