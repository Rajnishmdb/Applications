package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ENGLISH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        String url = "file:///android_asset/english.html";
        WebView view = this.findViewById(R.id.webEng);
        view.loadUrl(url);
    }
}
