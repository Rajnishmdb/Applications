package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DGTL_TELE_MNG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dgtl__tele__mng);
        String url = "file:///android_asset/tele.html";
        WebView view = this.findViewById(R.id.webTele);
        view.loadUrl(url);
    }
}
