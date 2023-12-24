package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ANALOG4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog4);

        String url = "file:///android_asset/analog4.html";
        WebView view = this.findViewById(R.id.webAnalog4);
        view.loadUrl(url);
    }
}
