package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mars extends AppCompatActivity implements View.OnClickListener{

    private Button mars_twoButton, mars_threeButton, mars_fourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);

        mars_twoButton=(Button) findViewById(R.id.mars_twoButtonID);
        mars_threeButton=(Button) findViewById(R.id.mars_threeButtonID);
        mars_fourButton=(Button) findViewById(R.id.mars_fourButtonID);

        mars_twoButton.setOnClickListener(this);
        mars_threeButton.setOnClickListener(this);
        mars_fourButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.mars_twoButtonID) {
            Toast.makeText(Mars.this, "Marie Curie During ORe6", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.mars_threeButtonID) {
            Toast.makeText(Mars.this, "Mars Crater Ice", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == R.id.mars_fourButtonID) {
            Toast.makeText(Mars.this, "Pathfinder Sol 8", Toast.LENGTH_SHORT).show();

        }

    }
}