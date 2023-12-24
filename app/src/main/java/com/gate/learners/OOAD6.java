package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OOAD6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ooad6);
        String url = "file:///android_asset/ooad.html";
        WebView view = this.findViewById(R.id.webOoad);
        view.loadUrl(url);
    }
}
