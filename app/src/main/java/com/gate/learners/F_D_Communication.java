package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class F_D_Communication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__d__communication);
        String url = "file:///android_asset/data_communication.html";
        WebView view = this.findViewById(R.id.webDCommunicate);
        view.loadUrl(url);
    }
}
