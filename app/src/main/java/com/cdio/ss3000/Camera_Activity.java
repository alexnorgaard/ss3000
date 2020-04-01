package com.cdio.ss3000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.FrameLayout;


public class Camera_Activity extends AppCompatActivity {

  Camera camera;
  FrameLayout framelayout;
  ShowCamera showCamera;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera_);
    framelayout = (FrameLayout)findViewById(R.id.frameLayout);

    //opens the camera
    camera = Camera.open();

    showCamera = new ShowCamera(this, camera);
    framelayout.addView(showCamera);
  }
}
