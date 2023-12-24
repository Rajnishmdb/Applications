package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PPL_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppl_6);
        String url = "file:///android_asset/p_pro_lang.html";
        WebView view = this.findViewById(R.id.webPpl);
        view.loadUrl(url);
    }
}
