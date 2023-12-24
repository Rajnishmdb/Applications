package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class BEE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bee);
        String url = "file:///android_asset/basicEEng.html";
        WebView view = this.findViewById(R.id.webBee);
        view.loadUrl(url);
    }
}
