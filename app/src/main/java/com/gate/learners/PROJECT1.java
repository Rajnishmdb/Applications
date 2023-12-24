package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PROJECT1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
        String url = "file:///android_asset/project1.html";
        WebView view = this.findViewById(R.id.webPro1);
        view.loadUrl(url);
    }
}
