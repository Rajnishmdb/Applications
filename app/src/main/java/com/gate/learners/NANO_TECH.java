package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NANO_TECH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nano__tech);
        String url = "file:///android_asset/nano.html";
        WebView view = this.findViewById(R.id.webNano);
        view.loadUrl(url);
    }
}
