package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CHEMISTRY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        String url = "file:///android_asset/chemistry.html";
        WebView view = this.findViewById(R.id.webChem);
        view.loadUrl(url);
    }
}
