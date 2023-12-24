package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class G_SYLLABUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g__syllabus);

        String url = "file:///android_asset/Gate_Syllabus.html";
        WebView view = this.findViewById(R.id.webGsy);
        view.loadUrl(url);
    }
}
