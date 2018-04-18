package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.administrator.tic_tac_toe.choice.win1;
import static com.example.administrator.tic_tac_toe.choice.win2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score2;

public class fiveBoardtic extends AppCompatActivity {
    int score1;
    int score2;
    int turn;
    int count;
    String yousc = ("YOU: " + score1 );
    String andsc = ("ANDROID: " + score2);
    Button bt11, bt12, bt13, bt14, bt15, bt21, bt22, bt23, bt24, bt25, bt31, bt32, bt33, bt34, bt35, bt41, bt42, bt43, bt44, bt45, bt51, bt52, bt53, bt54, bt55 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_five_boardtic);

        bt11 = (Button) findViewById(R.id.btn11);
        bt12 = (Button) findViewById(R.id.btn12);
        bt13 = (Button) findViewById(R.id.btn13);
        bt14 = (Button) findViewById(R.id.btn14);
        bt15 = (Button) findViewById(R.id.btn15);
        bt21 = (Button) findViewById(R.id.btn21);
        bt22 = (Button) findViewById(R.id.btn22);
        bt23 = (Button) findViewById(R.id.btn23);
        bt24 = (Button) findViewById(R.id.btn24);
        bt25 = (Button) findViewById(R.id.btn25);
        bt31 = (Button) findViewById(R.id.btn31);
        bt32 = (Button) findViewById(R.id.btn32);
        bt33 = (Button) findViewById(R.id.btn33);
        bt34 = (Button) findViewById(R.id.btn34);
        bt35 = (Button) findViewById(R.id.btn35);
        bt41 = (Button) findViewById(R.id.btn41);
        bt42 = (Button) findViewById(R.id.btn42);
        bt43 = (Button) findViewById(R.id.btn43);
        bt44 = (Button) findViewById(R.id.btn44);
        bt45 = (Button) findViewById(R.id.btn45);
        bt51 = (Button) findViewById(R.id.btn51);
        bt52 = (Button) findViewById(R.id.btn52);
        bt53 = (Button) findViewById(R.id.btn53);
        bt54 = (Button) findViewById(R.id.btn54);
        bt55 = (Button) findViewById(R.id.btn55);
    }


    public void onBackPressed() {
        Intent b = new Intent(this, selectoptions.class);
        startActivity(b);
        finish();
    }
    public void resetBoard (View view) {
        count = 0;
        bt11.setText("");
        bt12.setText("");
        bt13.setText("");
        bt21.setText("");
        bt22.setText("");
        bt23.setText("");
        bt31.setText("");
        bt32.setText("");
        bt33.setText("");
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt21.setEnabled(true);
        bt22.setEnabled(true);
        bt23.setEnabled(true);
        bt31.setEnabled(true);
        bt32.setEnabled(true);
        bt33.setEnabled(true);
    }

}
