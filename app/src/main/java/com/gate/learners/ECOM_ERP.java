package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ECOM_ERP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecom__erp);
        String url = "file:///android_asset/Ecom_Erp.html";
        WebView view = this.findViewById(R.id.webEcom);
        view.loadUrl(url);
    }
}
