package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PHYSICS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        String url = "file:///android_asset/physics.html";
        WebView view = this.findViewById(R.id.webPhy);
        view.loadUrl(url);
    }
}