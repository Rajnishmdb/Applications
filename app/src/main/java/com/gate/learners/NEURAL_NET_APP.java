package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class NEURAL_NET_APP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neural__net__app);
        String url = "file:///android_asset/neural.html";
        WebView view = this.findViewById(R.id.webNeuralN);
        view.loadUrl(url);
    }
}
