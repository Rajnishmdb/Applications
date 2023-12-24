package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class COMPILER_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compiler_6);
        String url = "file:///android_asset/compiler6.html";
        WebView view = this.findViewById(R.id.webCompiler6);
        view.loadUrl(url);
    }
}
