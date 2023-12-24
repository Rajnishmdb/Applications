package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class I_COMMUNICATE_SYS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i__communicate__sys);
        String url = "file:///android_asset/i_commun_sys.html";
        WebView view = this.findViewById(R.id.webCommun);
        view.loadUrl(url);
    }
}
