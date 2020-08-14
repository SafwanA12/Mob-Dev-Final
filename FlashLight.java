package com.example.campingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FlashLight extends AppCompatActivity {

    private CameraManager cameraManager;
    private String cameraID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_light);

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try {
            cameraID = cameraManager.getCameraIdList()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void TorchONButtonClick(View view){
        Toast.makeText(this,"Your LED Light is On", Toast.LENGTH_LONG).show();
        try {
            cameraManager.setTorchMode(cameraID, true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TorchOFFButtonClick(View view){
        Toast.makeText(this, "Your LED Light is Off", Toast.LENGTH_LONG).show();
        try {
            cameraManager.setTorchMode(cameraID, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}