package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SEM4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);
    }
    public void discrete(View v){
        Intent jump1 = new Intent(SEM4.this,DISCRETE_GRAPH.class);
        startActivity(jump1);
    }
    public void analog4(View v){
        Intent jump2 = new Intent(SEM4.this,ANALOG4.class);
        startActivity(jump2);
    }
    public void structure4(View v){
        Intent jump3 = new Intent(SEM4.this,DATA_S_4.class);
        startActivity(jump3);
    }
    public void architect(View v){
        Intent jump4 = new Intent(SEM4.this,C_ARCH.class);
        startActivity(jump4);
    }
    public void s_programing(View v){
        Intent jump5 = new Intent(SEM4.this,SYS_PROGRAM.class);
        startActivity(jump5);
    }
    public void Obip(View v){
        Intent jump6 = new Intent(SEM4.this,OBIP.class);
        startActivity(jump6);
    }
}
