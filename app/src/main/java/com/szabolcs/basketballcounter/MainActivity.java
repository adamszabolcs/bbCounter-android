package com.szabolcs.basketballcounter;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView homeCounter;
    private TextView awayCounter;
    private int homeScore = 0;
    private int awayScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        homeCounter = (TextView) findViewById(R.id.home_score);
        awayCounter = (TextView) findViewById(R.id.away_score);
    }

    public void addHome3Pt(View view) {
        homeScore += 3;
        if (homeCounter != null) {
            homeCounter.setText(String.valueOf(homeScore));
        }
        setWinner();
    }

    public void addHomeFG(View view) {
        homeScore += 2;
        if (homeCounter != null) {
            homeCounter.setText(String.valueOf(homeScore));
        }
        setWinner();
    }

    public void addHomeFT(View view) {
        homeScore++;
        if (homeCounter != null) {
            homeCounter.setText(String.valueOf(homeScore));
        }
        setWinner();
    }

    public void addAway3Pt(View view) {
        awayScore += 3;
        if (awayCounter != null) {
            awayCounter.setText(String.valueOf(awayScore));
        }
        setWinner();
    }

    public void addAwayFG(View view) {
        awayScore += 2;
        if (awayCounter != null) {
            awayCounter.setText(String.valueOf(awayScore));
        }
        setWinner();
    }

    public void addAwayFT(View view) {
        awayScore++;
        if (awayCounter != null) {
            awayCounter.setText(String.valueOf(awayScore));
        }
        setWinner();
    }

    public void subtractHome(View view) {
        homeScore--;
        if (homeCounter != null) {
            homeCounter.setText(String.valueOf(homeScore));
        }
        setWinner();
    }

    public void subtractAway(View view) {
        awayScore--;
        if (awayCounter != null) {
            awayCounter.setText(String.valueOf(awayScore));
        }
        setWinner();
    }

    private void setWinner() {
        homeCounter.setTextColor(Color.parseColor("#000000"));
        awayCounter.setTextColor(Color.parseColor("#000000"));
        if (homeScore > awayScore) {
            homeCounter.setTextColor(Color.parseColor("#a0b801"));
        } else if (awayScore > homeScore) {
            awayCounter.setTextColor(Color.parseColor("#a0b801"));
        }
    }
}
