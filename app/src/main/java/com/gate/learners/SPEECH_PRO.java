package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SPEECH_PRO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech__pro);
        String url = "file:///android_asset/speech.html";
        WebView view = this.findViewById(R.id.webSpeech);
        view.loadUrl(url);
    }
}
