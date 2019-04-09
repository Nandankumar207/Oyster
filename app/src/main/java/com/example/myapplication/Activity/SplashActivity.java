package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        fullScreen();
        splash();
    }

    private void fullScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }
    private void splash() {

        try {
            final Timer timer = new Timer();
            TimerTask task = new TimerTask() {

                @Override
                public void run() {

                    startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                    finish();
                   /* if(SharedPreferenceWriter.getInstance(SplashActivity.this).getString(SPreferenceKey.ISLOGIN).equals(ParamEnum.LOGIN.theValue())) {
                        Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(mainIntent);
                        finish();
                    }
                    else {
                        Intent mainIntent = new Intent(SplashActivity.this, LoginActivity.class);
                        startActivity(mainIntent);
                        finish();
                        // getDeviceToken();

                    }*/
                }
            };
            timer.schedule(task, 2000);
        } catch (Exception ex) {

        }
    }
}
