package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SOFT_ENGG_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft__engg_6);
        String url = "file:///android_asset/soft_engineering.html";
        WebView view = this.findViewById(R.id.webSEngg);
        view.loadUrl(url);
    }
}
