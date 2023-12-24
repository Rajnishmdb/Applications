package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DISCRETE_GRAPH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discrete__graph);

        String url = "file:///android_asset/discrete_graph.html";
        WebView view = this.findViewById(R.id.webDiscMath);
        view.loadUrl(url);
    }
}
