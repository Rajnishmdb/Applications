package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PARA_COMPUTING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para__computing);
        String url = "file:///android_asset/prlel_compute.html";
        WebView view = this.findViewById(R.id.webPrlCompute);
        view.loadUrl(url);
    }
}
