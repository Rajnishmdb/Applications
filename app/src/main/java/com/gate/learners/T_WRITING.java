package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class T_WRITING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t__writing);
        String url = "file:///android_asset/t_writing.html";
        WebView view = this.findViewById(R.id.webWriting);
        view.loadUrl(url);
    }
}
