package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class City extends AppCompatActivity {

    private WebView cityWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        cityWebView=(WebView) findViewById(R.id.cityWebViewID);

        WebSettings webSettings = cityWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        cityWebView.setWebViewClient(new WebViewClient());
        cityWebView.loadUrl("https://homeandcity.nasa.gov/nasa/city");


    }
}