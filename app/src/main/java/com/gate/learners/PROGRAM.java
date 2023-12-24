package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PROGRAM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        String url = "file:///android_asset/programing.html";
        WebView view = this.findViewById(R.id.webProg);
        view.loadUrl(url);
    }
}
