package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class P_MANAGEMENT_I_RELATION extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p__management__i__relation);
        String url = "file:///android_asset/pmir.html";
        WebView view = this.findViewById(R.id.webMange);
        view.loadUrl(url);
    }
}
