package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class XML_WEB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml__web);
        String url = "file:///android_asset/xml.html";
        WebView view = this.findViewById(R.id.webXml);
        view.loadUrl(url);
    }
}
