package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MUL_TECH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul__tech);
        String url = "file:///android_asset/mul_media.html";
        WebView view = this.findViewById(R.id.webMulMedia);
        view.loadUrl(url);
    }
}
