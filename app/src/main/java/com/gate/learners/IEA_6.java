package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IEA_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iea_6);
        String url = "file:///android_asset/iea.html";
        WebView view = this.findViewById(R.id.webIEA);
        view.loadUrl(url);
    }
}
