package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class selectoptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectoptions);
    }
    public void gochoice (View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void gocom (View View) {
        Intent i = new Intent(this, complay.class);
        startActivity(i);
    }
    public void gofive (View view) {
        Intent i = new Intent(this, fiveBoardtic.class);
        startActivity(i);
    }
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
        finish();
    }
}
