package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import static android.R.attr.name;
import static com.example.administrator.tic_tac_toe.MainActivity.name1;
import static com.example.administrator.tic_tac_toe.MainActivity.name2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.choice.win1;
import static com.example.administrator.tic_tac_toe.choice.win2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;

public class Winner2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_winner2);
            displayWinner(""+name2+" IS THE WINNER");

    }
    public void con (View view) {
        if (score1 == 3) {
            Intent mov = new Intent(this, MainActivity.class);
            startActivity(mov);
            finish();
        }else{
            Intent mo = new Intent(this, choice.class);
            startActivity(mo);
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
