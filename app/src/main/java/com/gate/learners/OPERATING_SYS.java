package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class OPERATING_SYS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating__sys);
        String url = "file:///android_asset/op_System.html";
        WebView view = this.findViewById(R.id.webOperate_Sys);
        view.loadUrl(url);
    }
}
