package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PROJECT2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);
        String url = "file:///android_asset/project2.html";
        WebView view = this.findViewById(R.id.webPro2);
        view.loadUrl(url);
    }
}
