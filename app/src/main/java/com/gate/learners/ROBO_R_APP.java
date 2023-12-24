package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ROBO_R_APP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo__r__app);
        String url = "file:///android_asset/robotics.html";
        WebView view = this.findViewById(R.id.webRobo);
        view.loadUrl(url);
    }
}
