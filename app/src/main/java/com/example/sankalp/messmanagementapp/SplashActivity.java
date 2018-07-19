package com.example.sankalp.messmanagementapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread startTimer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Intent intent0 = new Intent(SplashActivity.this, SlimpleTextClientActivity.class);
                    startActivity(intent0);
                    overridePendingTransition(R.anim.fadin, R.anim.fadout);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        startTimer.start();
    }
}