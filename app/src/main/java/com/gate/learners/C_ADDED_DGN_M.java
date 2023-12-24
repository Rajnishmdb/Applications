package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C_ADDED_DGN_M extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__added__dgn__m);
        String url = "file:///android_asset/CADM.html";
        WebView view = this.findViewById(R.id.webCADM);
        view.loadUrl(url);
    }
}
