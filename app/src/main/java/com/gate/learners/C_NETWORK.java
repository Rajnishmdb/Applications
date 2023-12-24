package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C_NETWORK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__network);
        String url = "file:///android_asset/computer_net.html";
        WebView view = this.findViewById(R.id.webNetwork);
        view.loadUrl(url);
    }
}
