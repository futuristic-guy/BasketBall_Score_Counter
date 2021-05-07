package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }

    public void displayThreeA(View view) {
        scoreTeamA += 3;
        displayScoreForTeamA(scoreTeamA);
    }

    public void displayTwoA(View view) {
        scoreTeamA += 2;
        displayScoreForTeamA(scoreTeamA);
    }

    public void displayOneA(View view) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void displayThreeB(View view) {
        scoreTeamB += 3;
        displayScoreForTeamB(scoreTeamB);
    }

    public void displayTwoB(View view) {
        scoreTeamB += 2;
        displayScoreForTeamB(scoreTeamB);
    }

    public void displayOneB(View view) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }


    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.point_counter);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.point_counter_b);
        scoreView.setText(String.valueOf(score));
    }

    public void resetView(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }

}