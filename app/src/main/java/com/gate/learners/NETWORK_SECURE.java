package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NETWORK_SECURE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network__secure);
        String url = "file:///android_asset/network_secur.html";
        WebView view = this.findViewById(R.id.webNetSecure);
        view.loadUrl(url);
    }
}
