package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class HomeCity extends AppCompatActivity implements View.OnClickListener{

    private Button homeButton, cityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_city);

        homeButton=(Button) findViewById(R.id.homeButtonID);
        cityButton=(Button) findViewById(R.id.cityButtonID);

        homeButton.setOnClickListener(this);
        cityButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.homeButtonID) {
            Intent intent=new Intent(HomeCity.this, Home.class );
            startActivity(intent);

        }
        if (v.getId() == R.id.cityButtonID) {
            Intent intent=new Intent(HomeCity.this, City.class );
            startActivity(intent);

        }

        }


}