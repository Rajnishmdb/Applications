package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MOB_WIRE_COMPUTING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob__wire__computing);
        String url = "file:///android_asset/mob_W_compute.html";
        WebView view = this.findViewById(R.id.webMWcompute);
        view.loadUrl(url);
    }
}
