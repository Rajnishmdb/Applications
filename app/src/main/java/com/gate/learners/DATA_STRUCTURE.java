package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DATA_STRUCTURE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__structure);
        String url = "file:///android_asset/data_str_algo.html";
        WebView view = this.findViewById(R.id.webStruAlgo);
        view.loadUrl(url);
    }
}
