package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class GENETIC_ALGO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genetic__algo);
        String url = "file:///android_asset/gene_Algo.html";
        WebView view = this.findViewById(R.id.webGene);
        view.loadUrl(url);
    }
}
