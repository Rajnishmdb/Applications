package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WORKSHOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        String url = "file:///android_asset/workshop.html";
        WebView view = this.findViewById(R.id.webWork);
        view.loadUrl(url);
    }
}
