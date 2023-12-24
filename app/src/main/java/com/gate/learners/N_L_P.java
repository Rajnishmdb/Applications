package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class N_L_P extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n__l__p);
        String url = "file:///android_asset/nlp.html";
        WebView view = this.findViewById(R.id.webNLP);
        view.loadUrl(url);
    }
}
