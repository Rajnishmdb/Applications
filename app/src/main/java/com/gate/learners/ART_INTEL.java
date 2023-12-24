package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ART_INTEL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art__intel);
        String url = "file:///android_asset/AI.html";
        WebView view = this.findViewById(R.id.webAI);
        view.loadUrl(url);
    }
}
