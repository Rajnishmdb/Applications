package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DATABASE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        String url = "file:///android_asset/database.html";
        WebView view = this.findViewById(R.id.webDatabase);
        view.loadUrl(url);
    }
}
