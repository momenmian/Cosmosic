package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FireMap extends AppCompatActivity {

    private WebView fireMapWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_map);

        fireMapWebView=(WebView) findViewById(R.id.fireMapWebViewID);

        WebSettings webSettings = fireMapWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        fireMapWebView.setWebViewClient(new WebViewClient());
        fireMapWebView.loadUrl("https://firms.modaps.eosdis.nasa.gov/map/");

    }
}