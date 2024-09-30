package com.example.ex1listeners;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvBlue = findViewById(R.id.tvBlue);
        TextView tvRed = findViewById(R.id.tvRed);
        TextView tvWinner = findViewById(R.id.tvWinner);

        Intent gi = getIntent();
        int blueScore = gi.getIntExtra("blueScore", 0);
        int redScore = gi.getIntExtra("redScore", 0);

        tvBlue.setText("Blue Score: " + blueScore);
        tvRed.setText("Red Score: " + redScore);

        if (blueScore > redScore) { tvWinner.setText("The Winner is: Blue"); }
        else if (redScore > blueScore) { tvWinner.setText("The Winner is: Red"); }
        else { tvWinner.setText("It's a tie!"); }
    }

    public void clickedBack(View view) { finish(); }
}