package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class C_ARCH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__arch);
        String url = "file:///android_asset/c_arch.html";
        WebView view = this.findViewById(R.id.webArch);
        view.loadUrl(url);
    }
}
