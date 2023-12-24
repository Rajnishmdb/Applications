package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class D_IMG_PRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d__img__pro);
        String url = "file:///android_asset/d_img_p.html";
        WebView view = this.findViewById(R.id.webDImgPro);
        view.loadUrl(url);
    }
}
