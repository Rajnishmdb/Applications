package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class VISUAL_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual__p);
        String url = "file:///android_asset/visul.html";
        WebView view = this.findViewById(R.id.webVisual);
        view.loadUrl(url);
    }
}
