package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class IMG_PRO_GIS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img__pro__gis);
        String url = "file:///android_asset/img_pro_gis.html";
        WebView view = this.findViewById(R.id.webImgPro);
        view.loadUrl(url);
    }
}
