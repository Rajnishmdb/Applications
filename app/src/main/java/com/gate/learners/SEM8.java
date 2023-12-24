package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8);
    }
    public void data_mining(View v){
        Intent jump1 = new Intent(SEM8.this,DATA_MINING.class);
        startActivity(jump1);
    }
    public void pmir(View v){
        Intent jump2 = new Intent(SEM8.this,P_MANAGEMENT_I_RELATION.class);
        startActivity(jump2);
    }
    public void security(View v){
        Intent jump3 = new Intent(SEM8.this,INFO_SECURITY.class);
        startActivity(jump3);
    }
    public void project2(View v){
        Intent jump4 = new Intent(SEM8.this,PROJECT2.class);
        startActivity(jump4);
    }
    public void elective8(View v){
        Intent jump5 = new Intent(SEM8.this,ELECTIVE.class);
        startActivity(jump5);
    }
}
