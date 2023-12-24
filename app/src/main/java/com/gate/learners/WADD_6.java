package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WADD_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wadd_6);
        String url = "file:///android_asset/wadd.html";
        WebView view = this.findViewById(R.id.webWadd);
        view.loadUrl(url);
    }
}
