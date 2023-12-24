package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MOB_COMPUTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob__compute);
        String url = "file:///android_asset/mob_comp.html";
        WebView view = this.findViewById(R.id.webMobComp);
        view.loadUrl(url);
    }
}
