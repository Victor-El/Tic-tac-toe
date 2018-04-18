package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import static android.os.Build.VERSION_CODES.M;

public class splashScreen extends AppCompatActivity {
    int splash = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent m = new Intent(splashScreen.this,selectoptions.class);
                splashScreen.this.startActivity(m);
                splashScreen.this.finish();
            }
        }, splash);
    }
}
