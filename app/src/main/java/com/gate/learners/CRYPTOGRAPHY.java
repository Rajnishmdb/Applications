package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CRYPTOGRAPHY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptography);
        String url = "file:///android_asset/crypto.html";
        WebView view = this.findViewById(R.id.webCrypto);
        view.loadUrl(url);
    }
}
