package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PATTERN_RECOG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pattern__recog);
        String url = "file:///android_asset/ptrn_recog.html";
        WebView view = this.findViewById(R.id.webP_recog);
        view.loadUrl(url);
    }
}
