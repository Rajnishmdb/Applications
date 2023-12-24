package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class VLSI_DGN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlsi__dgn);
        String url = "file:///android_asset/vlsi.html";
        WebView view = this.findViewById(R.id.webVlsi);
        view.loadUrl(url);
    }
}
