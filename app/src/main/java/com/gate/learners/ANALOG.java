package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ANALOG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog);
        String url = "file:///android_asset/analog.html";
        WebView view = this.findViewById(R.id.webAnalog);
        view.loadUrl(url);
    }
}
