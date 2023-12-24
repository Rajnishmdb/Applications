package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MICROCONTROLLER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microcontroller);
        String url = "file:///android_asset/M_control.html";
        WebView view = this.findViewById(R.id.webControl);
        view.loadUrl(url);
    }
}
