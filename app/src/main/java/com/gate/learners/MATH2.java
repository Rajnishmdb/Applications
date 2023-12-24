package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MATH2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math2);
        String url = "file:///android_asset/math2.html";
        WebView view = this.findViewById(R.id.webMath2);
        view.loadUrl(url);
    }
}
