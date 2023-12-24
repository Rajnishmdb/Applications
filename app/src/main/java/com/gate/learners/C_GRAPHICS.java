package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C_GRAPHICS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__graphics);
        String url = "file:///android_asset/c_graphics.html";
        WebView view = this.findViewById(R.id.webCGraph);
        view.loadUrl(url);
    }
}
