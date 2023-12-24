package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
    }
    public void algorithm5(View v){
        Intent jump1 = new Intent(SEM5.this,D_ALGORITHM.class);
        startActivity(jump1);
    }
    public void micro_process(View v){
        Intent jump2 = new Intent(SEM5.this,M_PROCESSOR.class);
        startActivity(jump2);
    }
    public void java(View v){
        Intent jump3 = new Intent(SEM5.this,JAVA.class);
        startActivity(jump3);
    }
    public void database(View v){
        Intent jump4 = new Intent(SEM5.this,DATABASE.class);
        startActivity(jump4);
    }
    public void operating_sys(View v){
        Intent jump5 = new Intent(SEM5.this,OPERATING_SYS.class);
        startActivity(jump5);
    }
    public void c_network(View v){
        Intent jump6 = new Intent(SEM5.this,C_NETWORK.class);
        startActivity(jump6);
    }
}
