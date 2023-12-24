package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class EGD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egd);
        String url = "file:///android_asset/EnggGraphics.html";
        WebView view = this.findViewById(R.id.webGraph);
        view.loadUrl(url);
    }
}
