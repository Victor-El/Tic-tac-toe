package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.administrator.tic_tac_toe.MainActivity.name1;
import static com.example.administrator.tic_tac_toe.MainActivity.name2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score2;

public class choice extends AppCompatActivity {
    Button b11, b12, b13, b21, b22, b23, b31, b32, b33;
    int turn;
    public static boolean win1 = false;
    public static boolean win2 = false;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choice);
        displayName1(name1);
        displayName2(name2);
        displayScore1(score1);
        displayScore2(score2);


        b11 = (Button) findViewById(R.id.tv11);
        b12 = (Button) findViewById(R.id.tv21);
        b13 = (Button) findViewById(R.id.tv31);
        b21 = (Button) findViewById(R.id.tv12);
        b22 = (Button) findViewById(R.id.tv22);
        b23 = (Button) findViewById(R.id.tv32);
        b31 = (Button) findViewById(R.id.tv13);
        b32 = (Button) findViewById(R.id.tv23);
        b33 = (Button) findViewById(R.id.tv33);
        turn = 1;

        /* switching turns depending on the values entered previously
        * by click the available buttons on the screen*/
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                        count =count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b11.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                        count = count + 1;
                    } else if (turn == 2) {
                        turn = 1;
                        b12.setText("O");
                        count = count + 1;

                    }
                }
                endGame();

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                        count = count +1;
                    } else if (turn == 2) {
                        turn = 1;
                        b13.setText("O");
                        count = count + 1;

                    }
                }
                endGame();

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b21.setText("X");
                        count = count + 1;
                    } else if (turn == 2) {
                        turn = 1;
                        b21.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b22.setText("X");
                        count = count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b22.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b23.setText("X");
                        count = count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b23.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b31.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b31.setText("X");
                        count = count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b31.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b32.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b32.setText("X");
                        count = count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b32.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b33.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b33.setText("X");
                        count = count+1;
                    } else if (turn == 2) {
                        turn = 1;
                        b33.setText("O");
                        count = count+1;

                    }
                }
                endGame();

            }
        });
    }


        public void endGame() {
            boolean end = false;
            String a, b, c, d, e, f, g, h, i;
            a = b11.getText().toString();
            b = b12.getText().toString();
            c = b13.getText().toString();
            d = b21.getText().toString();
            e = b22.getText().toString();
            f = b23.getText().toString();
            g = b31.getText().toString();
            h = b32.getText().toString();
            i = b33.getText().toString();


                // evaluating response of player x

                if (a.equals("X") && b.equals("X") && c.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " +name1, Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (a.equals("X") && d.equals("X") && g.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1, Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (a.equals("X") && e.equals("X") && i.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (b.equals("X") && e.equals("X") && h.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (c.equals("X") && f.equals("X") && i.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (c.equals("X") && e.equals("X") && g.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (d.equals("X") && e.equals("X") && f.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                } else if (g.equals("X") && h.equals("X") && i.equals("X")) {
                    Toast.makeText(choice.this, "Winner is player " + name1 + "", Toast.LENGTH_LONG).show();
                    win1 = true;
                    end = true;
                    if (win1 == true) {
                        score1 = score1+1;
                        displayScore1(score1);
                    } else {
                        score1 = score1 + 0;
                    }
                    Intent go = new Intent(this, winner.class);
                    startActivity(go);
                }


                // evaluating response of player o
                else if (a.equals("O") && b.equals("O") && c.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (a.equals("O") && d.equals("O") && g.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (a.equals("O") && e.equals("O") && i.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (b.equals("O") && e.equals("O") && h.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (c.equals("O") && f.equals("O") && i.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (c.equals("O") && e.equals("O") && g.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (d.equals("O") && e.equals("O") && f.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (g.equals("O") && h.equals("O") && i.equals("O")) {
                    Toast.makeText(choice.this, "Winner is player " + name2 + "", Toast.LENGTH_LONG).show();
                    win2 = true;
                    end = true;
                    if (win2 == true) {
                        score2 = score2+1;
                        displayScore2(score2);
                    } else {
                        score2 = score2 + 0;
                    }
                    Intent go = new Intent(this, Winner2.class);
                    startActivity(go);
                } else if (count == 9 && end == false ){
                    end = true;
                    Intent go = new Intent(this, draw.class);
                    startActivity(go);
                    Toast.makeText(choice.this, "THE GAME IS A DRAW", Toast.LENGTH_SHORT).show();

                }

            // disabling all buttons after a player has won
            if (end) {
                b11.setEnabled(false);
                b12.setEnabled(false);
                b13.setEnabled(false);
                b21.setEnabled(false);
                b22.setEnabled(false);
                b23.setEnabled(false);
                b31.setEnabled(false);
                b32.setEnabled(false);
                b33.setEnabled(false);

            }
            }


        public void displayName1(String name) {
            TextView nameView1 = (TextView) findViewById(R.id.playtv1);
            nameView1.setText(String.valueOf(name));
        }

        public void displayName2(String name) {
            TextView nameView1 = (TextView) findViewById(R.id.playtv2);
            nameView1.setText(String.valueOf(name));
        }

        public void displayScore1(int name) {
            TextView nameView1 = (TextView) findViewById(R.id.scoretv1);
            nameView1.setText(String.valueOf(name));
        }

        public void displayScore2(int name) {
            TextView nameView1 = (TextView) findViewById(R.id.scoretv2);
            nameView1.setText(String.valueOf(name));
        }

        public void onBackPressed() {
            Intent b = new Intent(this, MainActivity.class);
            startActivity(b);
            finish();
        }
    public void reset (View view) {
        count = 0;
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b31.setEnabled(true);
        b32.setEnabled(true);
        b33.setEnabled(true);
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        turn = 1;
    }
    public void gt (View view) {
        count = 0;
        score1 = 0;
        score2 = 0;
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b31.setEnabled(true);
        b32.setEnabled(true);
        b33.setEnabled(true);
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");
        Intent intent = new Intent(this, selectoptions.class);
        startActivity(intent);
    }


    }

