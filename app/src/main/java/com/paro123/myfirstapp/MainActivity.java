package com.paro123.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wView = findViewById(R.id.webView);
        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl("https://facebook.com");

        WebSettings webSettings = wView.getSettings();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    }

    @Override
    public void onBackPressed() {
        if(wView.canGoBack()) {
            wView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
