package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OBIP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obip);
        String url = "file:///android_asset/obip.html";
        WebView view = this.findViewById(R.id.webObip);
        view.loadUrl(url);
    }
}
