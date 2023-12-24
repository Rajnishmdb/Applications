package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OPT_THEORY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opt__theory);
        String url = "file:///android_asset/opt_Theory.html";
        WebView view = this.findViewById(R.id.webopt_T);
        view.loadUrl(url);
    }
}
