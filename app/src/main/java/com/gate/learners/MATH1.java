package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MATH1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math1);
        String url = "file:///android_asset/math1.html";
        WebView view = this.findViewById(R.id.webMath1);
        view.loadUrl(url);
    }
}
