package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DIS_COMPUTING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis__computing);
        String url = "file:///android_asset/distri_computing.html";
        WebView view = this.findViewById(R.id.webCompute);
        view.loadUrl(url);
    }
}
