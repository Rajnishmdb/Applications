package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class EMBEDDED_SYS_DGN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embedded__sys__dgn);
        String url = "file:///android_asset/embedded.html";
        WebView view = this.findViewById(R.id.webEmbedded);
        view.loadUrl(url);
    }
}
