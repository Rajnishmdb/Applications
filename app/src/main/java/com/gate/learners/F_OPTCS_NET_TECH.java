package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class F_OPTCS_NET_TECH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__optcs__net__tech);
        String url = "file:///android_asset/fiber.html";
        WebView view = this.findViewById(R.id.webFiber);
        view.loadUrl(url);
    }
}
