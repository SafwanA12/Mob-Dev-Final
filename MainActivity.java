package com.example.campingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button locationButton;
    private Button lightButton;
    private Button guideButton;
    private Button listButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationButton = (Button) findViewById(R.id.locationButton);
            locationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openLocationPage();
                }
            });
        lightButton = (Button) findViewById(R.id.lightButton);
            lightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openLightPage();
                }
            });
        guideButton =(Button) findViewById(R.id.guideButton);
            guideButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openGuidePage();
                }
            });
        listButton =(Button) findViewById(R.id.listButton);
            listButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openListPage();
                }
            });
    }

    public void openListPage() {
        Intent intent = new Intent( this, CheckList.class);
        startActivity(intent);
    }

    public void openGuidePage() {
        Intent intent = new Intent(this, Guide.class);
        startActivity(intent);
    }

    public void openLightPage() {
        Intent intent = new Intent( this, FlashLight.class);
        startActivity(intent);
    }

    public void openLocationPage() {
        Intent intent = new Intent(this, PinPoint.class);
        startActivity(intent);
    }
}