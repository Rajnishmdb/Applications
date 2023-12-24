package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class M_PROCESSOR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m__processor);
        String url = "file:///android_asset/micro_pro.html";
        WebView view = this.findViewById(R.id.webMProcess);
        view.loadUrl(url);
    }
}
