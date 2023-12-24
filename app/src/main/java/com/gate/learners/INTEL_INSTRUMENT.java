package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class INTEL_INSTRUMENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intel__instrument);
        String url = "file:///android_asset/intel_instr.html";
        WebView view = this.findViewById(R.id.webI_instru);
        view.loadUrl(url);
    }
}
