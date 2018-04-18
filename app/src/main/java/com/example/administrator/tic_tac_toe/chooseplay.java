package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import static android.R.attr.name;
import static com.example.administrator.tic_tac_toe.MainActivity.name1;
import static com.example.administrator.tic_tac_toe.MainActivity.name2;

public class chooseplay extends AppCompatActivity {
    public static int score1;
    public static int score2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chooseplay);
    }



}
