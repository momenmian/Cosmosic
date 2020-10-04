package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EarthObservation extends AppCompatActivity implements View.OnClickListener {

    private Button activeFireButton, carbonMonoxideButton, globalTemperatureButton, netRadiationButton, rainFallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth_observation);

        activeFireButton=findViewById(R.id.activeFireButtonId);
        carbonMonoxideButton=findViewById(R.id.coarbonMonoxideButtonId);
        globalTemperatureButton=findViewById(R.id.globalTemperatureAnomalyButtonId);
        netRadiationButton=findViewById(R.id.netRadiationButtonId);
        rainFallButton=findViewById(R.id.rainFallButtonId);

        activeFireButton.setOnClickListener(this);
        carbonMonoxideButton.setOnClickListener(this);
        globalTemperatureButton.setOnClickListener(this);
        netRadiationButton.setOnClickListener(this);
        rainFallButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.coarbonMonoxideButtonId) {
            Intent intent = new Intent(EarthObservation.this, CarbonMonoxide.class);
            startActivity(intent);

        }
    }
}