package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import static com.example.administrator.tic_tac_toe.MainActivity.name1;
import static com.example.administrator.tic_tac_toe.MainActivity.name2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score2;
import static com.example.administrator.tic_tac_toe.choice.win1;
import static com.example.administrator.tic_tac_toe.choice.win2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;

public class winner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_winner);
        if (win1 == true) {
            displayWinner(""+name1+" IS THE WINNER");
        }else if (win2 == true){
            displayWinner(""+name2+" IS THE WINNER");
        }
    }
    public void displayWinner (String win) {
        TextView winView = (TextView) findViewById(R.id.winview);
        winView.setText(String.valueOf(win));
    }
    public void onBackPressed () {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
