package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String name1;
    public static String name2;
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startGame (View view) {
        ed1 = (EditText) findViewById(R.id.p1);
        ed2 = (EditText) findViewById(R.id.p2);
        name1 = ed1.getText().toString();
        name2 = ed2.getText().toString();
        Intent i = new Intent(this, choice.class);
        startActivity(i);
    }
    public void onBackPressed() {
        Intent b = new Intent(this, selectoptions.class);
        startActivity(b);
        finish();
    }
}
