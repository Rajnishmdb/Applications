package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DATA_S_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__s_4);

        String url = "file:///android_asset/data_struct_4.html";
        WebView view = this.findViewById(R.id.webStruct4);
        view.loadUrl(url);
    }
}
