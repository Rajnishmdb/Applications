package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DATA_MINING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__mining);
        String url = "file:///android_asset/data_mining.html";
        WebView view = this.findViewById(R.id.webMining);
        view.loadUrl(url);
    }
}
