package com.example.administrator.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.M;
import static com.example.administrator.tic_tac_toe.MainActivity.name1;
import static com.example.administrator.tic_tac_toe.MainActivity.name2;
import static com.example.administrator.tic_tac_toe.choice.win1;
import static com.example.administrator.tic_tac_toe.choice.win2;
import static com.example.administrator.tic_tac_toe.chooseplay.score1;
import static com.example.administrator.tic_tac_toe.chooseplay.score2;

public class complay extends AppCompatActivity {
    Button bt11, bt12, bt13, bt21, bt22, bt23, bt31, bt32, bt33;
    int turn;
    int count;
    public static boolean wins1 = false;
    public static boolean wins2 = false;
    int scorecc;
    int scorec1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_complay);
        displayName1c("YOU");
        displayName2c("ANDROID");
        displayScore1c(scorecc);
        displayScore2c(scorec1);

        bt11 = (Button) findViewById(R.id.tvc11);
        bt12 = (Button) findViewById(R.id.tvc21);
        bt13 = (Button) findViewById(R.id.tvc31);
        bt21 = (Button) findViewById(R.id.tvc12);
        bt22 = (Button) findViewById(R.id.tvc22);
        bt23 = (Button) findViewById(R.id.tvc32);
        bt31 = (Button) findViewById(R.id.tvc13);
        bt32 = (Button) findViewById(R.id.tvc23);
        bt33 = (Button) findViewById(R.id.tvc33);

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt11.getText().toString().equals("")) {
                    turn = 1;
                    bt11.setText("X");
                    count = count + 1;
                if (bt31.getText().toString().equals("X") && bt13.getText().toString().equals("X"))  {
                    bt22.setText("O");
                } else {
                    if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                        if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")){
                            if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                    if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                        if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                            if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                                if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                                    if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                                        bt11.setText("O");
                                                    }
                                                } else {
                                                    bt21.setText("O");
                                                }
                                            } else {
                                                bt31.setText("O");
                                            }
                                        } else {
                                            bt12.setText("O");
                                        }
                                    } else {
                                        bt22.setText("O");
                                    }
                                } else {
                                    bt32.setText("O");
                                }
                            } else {
                                bt13.setText("O");
                            }
                        } else {
                            bt23.setText("O");
                        }
                    } else {
                        bt33.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt12.getText().toString().equals("")) {
                    turn = 1;
                    bt12.setText("X");
                    count = count + 1;
                if (bt12.getText().toString().equals("X") && bt32.getText().toString().equals("X"))  {
                        bt22.setText("O");
                    } else {
                        if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                        if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")){
                            if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                    if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                        if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                            if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                                if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                                    if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                                        bt23.setText("O");
                                                    }
                                                } else {
                                                    bt11.setText("O");
                                                }
                                            } else {
                                                bt21.setText("O");
                                            }
                                        } else {
                                            bt31.setText("O");
                                        }
                                    } else {
                                        bt33.setText("O");
                                    }
                                } else {
                                    bt13.setText("O");
                                }
                            } else {
                                bt22.setText("O");
                            }
                        } else {
                            bt32.setText("O");
                        }
                    } else {
                        bt12.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt13.getText().toString().equals("")) {
                    turn = 1;
                    bt13.setText("X");
                    count = count + 1;
                if (bt21.getText().toString().equals("X") && bt22.getText().toString().equals("X"))  {
                        bt23.setText("O");
                    } else {
                        if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                        if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")){
                            if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                    if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                        if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                            if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                                if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                                    if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                                        bt33.setText("O");
                                                    }
                                                } else {
                                                    bt23.setText("O");
                                                }
                                            } else {
                                                bt13.setText("O");
                                            }
                                        } else {
                                            bt32.setText("O");
                                        }
                                    } else {
                                        bt22.setText("O");
                                    }
                                } else {
                                    bt12.setText("O");
                                }
                            } else {
                                bt31.setText("O");
                            }
                        } else {
                            bt21.setText("O");
                        }
                    } else {
                        bt11.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt21.getText().toString().equals("")) {
                    turn = 1;
                    bt21.setText("X");
                    count = count + 1;
                if (bt13.getText().toString().equals("X") && bt22.getText().toString().equals("X"))  {
                        bt31.setText("O");
                    } else {
                        if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                        if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")){
                            if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                    if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                        if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                            if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                                if (bt11.getText().toString().equals("X") || bt11.getText().toString().equals("O")) {
                                                    if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                                        bt12.setText("O");
                                                    }
                                                } else {
                                                    bt11.setText("O");
                                                }
                                            } else {
                                                bt23.setText("O");
                                            }
                                        } else {
                                            bt31.setText("O");
                                        }
                                    } else {
                                        bt13.setText("O");
                                    }
                                } else {
                                    bt32.setText("O");
                                }
                            } else {
                                bt22.setText("O");
                            }
                        } else {
                            bt33.setText("O");
                        }
                    } else {
                        bt21.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt22.getText().toString().equals("")) {
                    turn = 1;
                    bt22.setText("X");
                    count = count + 1;
                if (bt31.getText().toString().equals("X") && bt32.getText().toString().equals("X"))  {
                        bt33.setText("O");
                    } else {
                        if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                        if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")){
                            if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                    if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                        if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                            if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                                if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                                    if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                                        bt23.setText("O");
                                                    }
                                                } else {
                                                    bt33.setText("O");
                                                }
                                            } else {
                                                bt13.setText("O");
                                            }
                                        } else {
                                            bt11.setText("O");
                                        }
                                    } else {
                                        bt12.setText("O");
                                    }
                                } else {
                                    bt21.setText("O");
                                }
                            } else {
                                bt13.setText("O");
                            }
                        } else {
                            bt22.setText("O");
                        }
                    } else {
                        bt31.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt23.getText().toString().equals("")) {
                    turn = 1;
                    bt23.setText("X");
                    count = count + 1;
                if (bt12.getText().toString().equals("X") && bt22.getText().toString().equals("X"))  {
                        bt32.setText("O");
                    } else {
                        if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                        if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")){
                            if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                    if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                        if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                            if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                                if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                                    if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                                        bt22.setText("O");
                                                    }
                                                } else {
                                                    bt21.setText("O");
                                                }
                                            } else {
                                                bt31.setText("O");
                                            }
                                        } else {
                                            bt23.setText("O");
                                        }
                                    } else {
                                        bt32.setText("O");
                                    }
                                } else {
                                    bt33.setText("O");
                                }
                            } else {
                                bt11.setText("O");
                            }
                        } else {
                            bt12.setText("O");
                        }
                    } else {
                        bt13.setText("O");
                    }
                    count = count+ 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt31.getText().toString().equals("")) {
                    turn = 1;
                    bt31.setText("X");
                    count = count + 1;
                if (bt11.getText().toString().equals("X") && bt12.getText().toString().equals("X"))  {
                        bt13.setText("O");
                    } else {
                        if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                        if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")){
                            if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                    if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                        if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                            if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                                if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                                    if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                                        bt13.setText("O");
                                                    }
                                                } else {
                                                    bt12.setText("O");
                                                }
                                            } else {
                                                bt23.setText("O");
                                            }
                                        } else {
                                            bt31.setText("O");
                                        }
                                    } else {
                                        bt11.setText("O");
                                    }
                                } else {
                                    bt32.setText("O");
                                }
                            } else {
                                bt21.setText("O");
                            }
                        } else {
                            bt33.setText("O");
                        }
                    } else {
                        bt22.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt32.getText().toString().equals("")) {
                    turn = 1;
                    bt32.setText("X");
                    count = count + 1;
                if (bt12.getText().toString().equals("X") && bt13.getText().toString().equals("X"))  {
                        bt11.setText("O");
                    } else {
                        if (bt11.getText().toString().equals("X") || bt11.getText().toString().equals("O")) {
                        if (bt21.getText().toString().equals("X") || bt21.getText().toString().equals("O")){
                            if (bt12.getText().toString().equals("X") || bt12.getText().toString().equals("O")) {
                                if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                                    if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                        if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                            if (bt32.getText().toString().equals("X")  || bt32.getText().toString().equals("O")) {
                                                if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                                    if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                                        bt13.setText("O");
                                                    }
                                                } else {
                                                    bt31.setText("O");
                                                }
                                            } else {
                                                bt32.setText("O");
                                            }
                                        } else {
                                            bt22.setText("O");
                                        }
                                    } else {
                                        bt33.setText("O");
                                    }
                                } else {
                                    bt23.setText("O");
                                }
                            } else {
                                bt12.setText("O");
                            }
                        } else {
                            bt21.setText("O");
                        }
                    } else {
                        bt11.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
        bt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bt33.getText().toString().equals("")) {
                    turn = 1;
                    bt33.setText("X");
                    count = count + 1;
                if (bt21.getText().toString().equals("X") && bt22.getText().toString().equals("X"))  {
                        bt23.setText("O");
                    } else {
                        if (bt23.getText().toString().equals("X")  || bt23.getText().toString().equals("O")) {
                        if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")){
                            if (bt22.getText().toString().equals("X")  || bt22.getText().toString().equals("O")) {
                                if (bt13.getText().toString().equals("X")  || bt13.getText().toString().equals("O")) {
                                    if (bt31.getText().toString().equals("X")  || bt31.getText().toString().equals("O")) {
                                        if (bt21.getText().toString().equals("X")  || bt21.getText().toString().equals("O")) {
                                            if (bt12.getText().toString().equals("X")  || bt12.getText().toString().equals("O")) {
                                                if (bt11.getText().toString().equals("X")  || bt11.getText().toString().equals("O")) {
                                                    if (bt33.getText().toString().equals("X")  || bt33.getText().toString().equals("O")) {
                                                        bt33.setText("O");
                                                    }
                                                } else {
                                                    bt11.setText("O");
                                                }
                                            } else {
                                                bt12.setText("O");
                                            }
                                        } else {
                                            bt21.setText("O");
                                        }
                                    } else {
                                        bt31.setText("O");
                                    }
                                } else {
                                    bt13.setText("O");
                                }
                            } else {
                                bt22.setText("O");
                            }
                        } else {
                            bt11.setText("O");
                        }
                    } else {
                        bt23.setText("O");
                    }
                    count = count + 1;
                    turn = 2;
                }}
                endGame();

            }
        });
    }


    public void endGame() {
        boolean end = false;
        String a, b, c, d, e, f, g, h, i;
        a = bt11.getText().toString();
        b = bt12.getText().toString();
        c = bt13.getText().toString();
        d = bt21.getText().toString();
        e = bt22.getText().toString();
        f = bt23.getText().toString();
        g = bt31.getText().toString();
        h = bt32.getText().toString();
        i = bt33.getText().toString();


        // evaluating response of player x

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(complay.this, "YOU are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }

        } else if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(complay.this, "YOU are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }

        } else if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(complay.this, "YOU are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }
        } else if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(complay.this, "you are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }

        } else if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(complay.this, "you are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }

        } else if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(complay.this, "you are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }
        } else if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(complay.this, "you are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }
        } else if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(complay.this, "you are the winner", Toast.LENGTH_LONG).show();
            win1 = true;
            end = true;
            if (win1 == true) {
                score1 = score1+1;
                displayScore1c(score1);
            } else {
                score1 = score1 + 0;
            }
        }


        // evaluating response of player o
        else if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(complay.this, "Android is the winner", Toast.LENGTH_LONG).show();
            win2 = true;
            end = true;
            if (win2 == true) {
                score2 = score2+1;
                displayScore2c(score2);
            } else {
                score2 = score2 + 0;
            }
        } else if (count >= 9 && end == false ){
            end = true;
            Toast.makeText(complay.this, "THE GAME IS A DRAW", Toast.LENGTH_SHORT).show();

        }

        // disabling all buttons after a player has won
        if (end) {
            bt11.setEnabled(false);
            bt12.setEnabled(false);
            bt13.setEnabled(false);
            bt21.setEnabled(false);
            bt22.setEnabled(false);
            bt23.setEnabled(false);
            bt31.setEnabled(false);
            bt32.setEnabled(false);
            bt33.setEnabled(false);

        }
    }

    public void displayName1c(String name) {
        TextView nameView1 = (TextView) findViewById(R.id.playctv1);
        nameView1.setText(String.valueOf(name));
    }

    public void displayName2c(String name) {
        TextView nameView1 = (TextView) findViewById(R.id.playtvc2);
        nameView1.setText(String.valueOf(name));
    }

    public void displayScore1c(int name) {
        TextView nameView1 = (TextView) findViewById(R.id.scorectv1);
        nameView1.setText(String.valueOf(name));
    }

    public void displayScore2c(int name) {
        TextView nameView1 = (TextView) findViewById(R.id.scoretvc2);
        nameView1.setText(String.valueOf(name));
    }
    public void res (View view) {
        count = 0;
        scorec1 = 0;
        scorecc = 0;
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt21.setEnabled(true);
        bt22.setEnabled(true);
        bt23.setEnabled(true);
        bt31.setEnabled(true);
        bt32.setEnabled(true);
        bt33.setEnabled(true);
        bt11.setText("");
        bt12.setText("");
        bt13.setText("");
        bt21.setText("");
        bt22.setText("");
        bt23.setText("");
        bt31.setText("");
        bt32.setText("");
        bt33.setText("");
    }
    public void got (View view) {
        count = 0;
        scorec1 = 0;
        scorecc = 0;
        bt11.setEnabled(true);
        bt12.setEnabled(true);
        bt13.setEnabled(true);
        bt21.setEnabled(true);
        bt22.setEnabled(true);
        bt23.setEnabled(true);
        bt31.setEnabled(true);
        bt32.setEnabled(true);
        bt33.setEnabled(true);
        bt11.setText("");
        bt12.setText("");
        bt13.setText("");
        bt21.setText("");
        bt22.setText("");
        bt23.setText("");
        bt31.setText("");
        bt32.setText("");
        bt33.setText("");
        Intent intent = new Intent(this, selectoptions.class);
        startActivity(intent);
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
