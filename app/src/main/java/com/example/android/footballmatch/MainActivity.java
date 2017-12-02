package com.example.android.footballmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalrma = 0 , foulrma = 0 , ycardrma = 0 , rcardrma = 0 , goalsrma = 0;
    int goalfcb = 0 , foulfcb = 0 , ycardfcb = 0 , rcardfcb = 0 , goalsbrc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goalrma(View view){
        goalrma = goalrma +1;
        TextView scoreView = (TextView) findViewById(R.id.goalsrma);
        scoreView.setText("" + goalrma);

    }

    public void foulrma(View view){
        foulrma = foulrma +1;
        TextView scoreView = (TextView) findViewById(R.id.foulsrma);
        scoreView.setText("" + foulrma);

    }
    public void ycardrma (View view){
        ycardrma = ycardrma +1;
        TextView scoreView = (TextView) findViewById(R.id.ycardsrma);
        scoreView.setText("" + ycardrma);

    }
    public void rcardrma(View view){
        rcardrma = rcardrma +1;
        TextView scoreView = (TextView) findViewById(R.id.rcardsrma);
        scoreView.setText("" + rcardrma);

    }

    public void goalfcb(View view){
        goalfcb = goalfcb +1;
        TextView scoreView = (TextView) findViewById(R.id.goalsfcb);
        scoreView.setText("" + goalfcb);

    }

    public void foulfcb(View view){
        foulfcb = foulfcb +1;
        TextView scoreView = (TextView) findViewById(R.id.foulsfcb);
        scoreView.setText("" + foulfcb);

    }
    public void ycardfcb (View view){
        ycardfcb = ycardfcb +1;
        TextView scoreView = (TextView) findViewById(R.id.ycardsfcb);
        scoreView.setText("" + ycardfcb);

    }
    public void rcardfcb(View view){
        rcardfcb = rcardfcb +1;
        TextView scoreView = (TextView) findViewById(R.id.rcardsfcb);
        scoreView.setText("" + rcardfcb);

    }

    public void result(View view){
    if (goalrma > goalfcb){
        TextView scoreView = (TextView) findViewById(R.id.game_on);
        scoreView.setText("The Winner is Real Madrid");
    }
    else if (goalrma < goalfcb){
        TextView scoreView = (TextView) findViewById(R.id.game_on);
        scoreView.setText("The Winner is Barcelona");
    }
    else if (goalrma == goalfcb){
        TextView scoreView = (TextView) findViewById(R.id.game_on);
        scoreView.setText("Penalty Kicks");
    }
    }

    public void reset(View view){
         goalsrma = 0 ; goalrma = 0 ; foulrma = 0 ; ycardrma = 0 ; rcardrma = 0;
         goalsbrc = 0 ; goalfcb = 0 ; foulfcb = 0 ; ycardfcb = 0 ; rcardfcb = 0;

        TextView scoreView = (TextView) findViewById(R.id.game_on);
        TextView scoreView1 = (TextView) findViewById(R.id.goalsrma);
        TextView scoreView2 = (TextView) findViewById(R.id.foulsrma);
        TextView scoreView3 = (TextView) findViewById(R.id.ycardsrma);
        TextView scoreView4 = (TextView) findViewById(R.id.rcardsrma);
        TextView scoreView5 = (TextView) findViewById(R.id.goalsfcb);
        TextView scoreView6 = (TextView) findViewById(R.id.foulsfcb);
        TextView scoreView7 = (TextView) findViewById(R.id.ycardsfcb);
        TextView scoreView8 = (TextView) findViewById(R.id.rcardsfcb);

        scoreView.setText("Game On");
        scoreView1.setText("" + goalrma);
        scoreView2.setText("" + foulrma);
        scoreView3.setText("" + ycardrma);
        scoreView4.setText("" + rcardrma);
        scoreView5.setText("" + goalfcb);
        scoreView6.setText("" + foulfcb);
        scoreView7.setText("" + ycardfcb);
        scoreView8.setText("" + rcardfcb);
}
}
