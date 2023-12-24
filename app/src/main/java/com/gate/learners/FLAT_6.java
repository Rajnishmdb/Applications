package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FLAT_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_6);
        String url = "file:///android_asset/formal_automata.html";
        WebView view = this.findViewById(R.id.webFlat);
        view.loadUrl(url);
    }
}
