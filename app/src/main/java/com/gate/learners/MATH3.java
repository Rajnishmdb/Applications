package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MATH3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math3);
        String url = "file:///android_asset/math3.html";
        WebView view = this.findViewById(R.id.webMath3);
        view.loadUrl(url);
    }
}
