package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PER_EVAL_C_SYS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per__eval__c__sys);
        String url = "file:///android_asset/per_Eval_CS.html";
        WebView view = this.findViewById(R.id.webP_Eval_CS);
        view.loadUrl(url);
    }
}
