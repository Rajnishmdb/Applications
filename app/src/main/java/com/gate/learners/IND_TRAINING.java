package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IND_TRAINING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ind__training);
        String url = "file:///android_asset/indus_training.html";
        WebView view = this.findViewById(R.id.webTraining);
        view.loadUrl(url);
    }
}
