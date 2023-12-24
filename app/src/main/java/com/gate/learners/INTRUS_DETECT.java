package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class INTRUS_DETECT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrus__detect);
        String url = "file:///android_asset/intus_detect.html";
        WebView view = this.findViewById(R.id.webIntru);
        view.loadUrl(url);
    }
}
