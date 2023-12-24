package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Real_Time_Sys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real__time__sys);
        String url = "file:///android_asset/real_time_sys.html";
        WebView view = this.findViewById(R.id.webRealT);
        view.loadUrl(url);
    }
}