package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SYS_PROGRAM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sys__program);
        String url = "file:///android_asset/s_program.html";
        WebView view = this.findViewById(R.id.webSysPro);
        view.loadUrl(url);
    }
}
