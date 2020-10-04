package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Home extends AppCompatActivity {

    private WebView homeWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeWebView=(WebView) findViewById(R.id.homeWebViewID);

        WebSettings webSettings = homeWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        homeWebView.setWebViewClient(new WebViewClient());
        homeWebView.loadUrl("https://homeandcity.nasa.gov/nasa/home");
    }
}