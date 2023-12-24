package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class D_SIG_PRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d__sig__pro);
        String url = "file:///android_asset/dsp.html";
        WebView view = this.findViewById(R.id.webDSP);
        view.loadUrl(url);
    }
}
