package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C_GEOMATRY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__geomatry);
        String url = "file:///android_asset/C_geometry.html";
        WebView view = this.findViewById(R.id.webGeometry);
        view.loadUrl(url);
    }
}
