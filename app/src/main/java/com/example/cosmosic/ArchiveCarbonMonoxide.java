package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ArchiveCarbonMonoxide extends AppCompatActivity implements View.OnClickListener {

    private Button  CMimage2Button, CMimage3Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive_carbon_monoxide);

        CMimage2Button=(Button) findViewById(R.id.cmim2ButtonID);
        CMimage3Button=(Button) findViewById(R.id.cmim3ButtonID);

        CMimage2Button.setOnClickListener(this);
        CMimage3Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cmim2ButtonID) {
            Toast.makeText(ArchiveCarbonMonoxide.this, "Download High Quality Image:\n" +
                    "https://neo.sci.gsfc.nasa.gov/servlet/RenderData?si=1716646&cs=rgb&format=JPEG&width=1440&height=720d", Toast.LENGTH_LONG).show();

        }
        if (v.getId() == R.id.cmim3ButtonID) {
            Toast.makeText(ArchiveCarbonMonoxide.this, "Download High Quality Image:\n" +
                    "https://neo.sci.gsfc.nasa.gov/servlet/RenderData?si=1716646&cs=rgb&format=JPEG&width=1440&height=720d", Toast.LENGTH_LONG).show();

        }

    }
}