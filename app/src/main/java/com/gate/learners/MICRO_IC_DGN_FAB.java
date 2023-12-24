package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MICRO_IC_DGN_FAB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micro__ic__dgn__fab);
        String url = "file:///android_asset/m_ic_fab.html";
        WebView view = this.findViewById(R.id.webMicroFab);
        view.loadUrl(url);
    }
}
