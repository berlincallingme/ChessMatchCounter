package com.example.brand.chessmatchcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int playerOneScore = 0;

    int playerTwoScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawForPlayerOne(View v) {
        playerOneScore = playerOneScore + 1;
        displayPlayerOneScore(playerOneScore);
    }
    public void winForPlayerOne(View v) {
        playerOneScore = playerOneScore + 2;
        displayPlayerOneScore(playerOneScore);
    }


    public void drawForPlayerTwo(View v) {
        playerTwoScore = playerTwoScore + 1;
        displayPlayerTwoScore(playerTwoScore);
    }


    public void winForPlayerTwo(View v) {
        playerTwoScore = playerTwoScore + 2;
        displayPlayerTwoScore(playerTwoScore);
    }


    public void resetScore(View v) {
        playerOneScore = 0;
        playerTwoScore = 0;
        displayPlayerOneScore(playerOneScore);
        displayPlayerTwoScore(playerTwoScore);
    }


    public void displayPlayerOneScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chess_player_1_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayPlayerTwoScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chess_player_2_score);
        scoreView.setText(String.valueOf(score));
    }
}
