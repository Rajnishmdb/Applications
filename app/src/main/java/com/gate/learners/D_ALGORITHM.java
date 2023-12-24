package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class D_ALGORITHM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d__algorithm);
        String url = "file:///android_asset/algo.html";
        WebView view = this.findViewById(R.id.webAlgorithm5);
        view.loadUrl(url);
    }
}
