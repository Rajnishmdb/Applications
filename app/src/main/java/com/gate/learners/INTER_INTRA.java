package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class INTER_INTRA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter__intr);
        String url = "file:///android_asset/intera.html";
        WebView view = this.findViewById(R.id.webIntera);
        view.loadUrl(url);
    }
}
