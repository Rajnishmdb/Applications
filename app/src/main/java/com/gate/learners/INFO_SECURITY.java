package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class INFO_SECURITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__security);
        String url = "file:///android_asset/info_security.html";
        WebView view = this.findViewById(R.id.webSecurity);
        view.loadUrl(url);
    }
}
