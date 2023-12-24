package com.gate.learners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class G_NOTICE extends AppCompatActivity {
    private WebView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g__notice);
        Toast.makeText(getApplicationContext(), "Checking your connectivity", Toast.LENGTH_LONG).show();
        view = this.findViewById(R.id.webNotice);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://gate.iitd.ac.in/index.php");
        WebSettings webSettings = view.getSettings();
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
    }
    @Override
    public void onBackPressed() {
        if (view.canGoBack())
        {
            view.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
