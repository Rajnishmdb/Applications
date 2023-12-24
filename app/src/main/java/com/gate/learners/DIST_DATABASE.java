package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DIST_DATABASE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dist__database);
        String url = "file:///android_asset/dis_database.html";
        WebView view = this.findViewById(R.id.webDData);
        view.loadUrl(url);
    }
}
