package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA=0;
    int scoreForTeamB=0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);

    }
    private void displayForTeamA(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    private void displayForTeamB(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view)
    {


       scoreForTeamA+=3;
      displayForTeamA(scoreForTeamA);  //Write code for +3 Points for Team A here
    }
    public void addThreeForTeamB(View view)
    {
       scoreForTeamB+=3;
       displayForTeamB(scoreForTeamB); //Write code for +3 Points for Team B here
    }
    public void addTwoForTeamB(View view)
    {
       scoreForTeamB+=2;
       displayForTeamB(scoreForTeamB); //Write code for +2 Points for Team B here
    }
    public void freeThrowForTeamB(View view)
    {
       scoreForTeamB+=1;
       displayForTeamB(scoreForTeamB); //Write code for Free Throw for Team A here
    }
    public void addTwoForTeamA(View view)
    {
       scoreForTeamA+=2;
       displayForTeamA(scoreForTeamA); //Write code for +2 Points for Team A here
    }
    public void freeThrowForTeamA(View view)
    {
      scoreForTeamA+=1;
       displayForTeamA(scoreForTeamA); //Write code for Free Throw for Team A here
    }
    public void reset(View view)
    {
      scoreForTeamA=0;
       scoreForTeamB=0;
       displayForTeamA(scoreForTeamA);
       displayForTeamB(scoreForTeamB); //Write code for Reset Button here
    }
}
