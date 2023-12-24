package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class JAVA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jav);
        String url = "file:///android_asset/java.html";
        WebView view = this.findViewById(R.id.webJava);
        view.loadUrl(url);
    }
}
