package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    private CardView earthobservationCardView, homecityCardView, marsCardView, fireCardView, spacecraftCardView, missionCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        earthobservationCardView=findViewById(R.id.earthobservationCardViewID);
        homecityCardView=findViewById(R.id.homecityCardViewID);
        marsCardView=findViewById(R.id.marsCardViewID);
        fireCardView=findViewById(R.id.fireCardViewID);
        spacecraftCardView=findViewById(R.id.spacecraftCardViewID);
        missionCardView=findViewById(R.id.missionCardViewID);

        earthobservationCardView.setOnClickListener(this);
        homecityCardView.setOnClickListener(this);
        marsCardView.setOnClickListener(this);
        fireCardView.setOnClickListener(this);
        spacecraftCardView.setOnClickListener(this);
        missionCardView.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.earthobservationCardViewID) {
            Intent intent = new Intent(MainMenu.this, EarthObservation.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.homecityCardViewID) {
            Intent intent = new Intent(MainMenu.this, HomeCity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.marsCardViewID) {
            Intent intent = new Intent(MainMenu.this, Mars.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.fireCardViewID) {
            Intent intent = new Intent(MainMenu.this, FireMap.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.spacecraftCardViewID) {
            Intent intent = new Intent(MainMenu.this, SpaceCraft.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.missionCardViewID) {
            Intent intent = new Intent(MainMenu.this, Mission.class);
            startActivity(intent);
        }
    }
}