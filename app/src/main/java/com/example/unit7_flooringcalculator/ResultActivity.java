package com.example.unit7_flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvResults;
    double length;
    double width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResults = (TextView) findViewById(R.id.textViewResults);

        Flooring floor = new Flooring(width,length);
        Bundle extras = getIntent().getExtras();
        width = extras.getDouble("MAINWIDTH");
        length = extras.getDouble("MAINLENGTH");


        final String results = "The width is " + width + " and the length is " + length + ". You need " + floor.calculateArea(width, length) + " square feet (or whatever you measured in)";
        tvResults.setText(results);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent goBack = new Intent(ResultActivity.this, MainActivity.class);
                goBack.putExtra("results", results);
                //setResult(0, goBack);
                //setResult(ResultActivity.RESULT_OK, goBack);
                ResultActivity.this.startActivity(goBack);
                //ResultActivity.this.finish();
            }
        }, 5000);


    }
}
