package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GATE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
    }
    public void syllabus(View v){
        Intent go1 = new Intent(GATE.this,G_SYLLABUS.class);
        startActivity(go1);
    }

    public void notice(View v){
        Intent go3 = new Intent(GATE.this,G_NOTICE.class);
        startActivity(go3);
    }
}
