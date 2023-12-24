package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AVD_C_ARCH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avd__c__arch);
        String url = "file:///android_asset/avd_C_arch.html";
        WebView view = this.findViewById(R.id.webACArch);
        view.loadUrl(url);
    }
}
