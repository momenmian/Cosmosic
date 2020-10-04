package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SpaceCraft extends AppCompatActivity implements View.OnClickListener {

    private Button spacecraft_one, spacecraft_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_craft);

        spacecraft_one=(Button) findViewById(R.id.spacecraft_oneButtonID);
        spacecraft_two=(Button) findViewById(R.id.spacecraft_twoButtonID);

        spacecraft_one.setOnClickListener(this);
        spacecraft_two.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.spacecraft_oneButtonID) {
            Toast.makeText(SpaceCraft.this, "ACE-sm", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.spacecraft_twoButtonID) {
            Toast.makeText(SpaceCraft.this, "ACRIMSAT-sm", Toast.LENGTH_SHORT).show();
        }

    }
}