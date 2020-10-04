package com.example.cosmosic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarbonMonoxide extends AppCompatActivity {

    private Button archiveCMButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carbon_monoxide);

        archiveCMButton=(Button) findViewById(R.id.archiveCMButtonId);
        archiveCMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CarbonMonoxide.this, ArchiveCarbonMonoxide.class);
                startActivity(intent);
            }
        });
    }
}