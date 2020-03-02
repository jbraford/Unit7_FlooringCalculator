package com.example.unit7_flooringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tvWidth;
    EditText tvLength;
    Button btnCalculate;
    TextView tvResultsMain;
    Double width;
    Double length;
    String results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWidth = (EditText) findViewById(R.id.editTextWidth);
        tvLength = (EditText) findViewById(R.id.editTextLength);
        btnCalculate = (Button) findViewById(R.id.buttonCalculate);
        tvResultsMain = (TextView) findViewById(R.id.textViewResultsMain);

        //Bundle extras = getIntent().getExtras();
        //results = extras.getString("results");
        // if (results.isEmpty() == false) {
        //    tvResultsMain.setText(results);
        //}

       btnCalculate.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {

               width = Double.parseDouble(tvWidth.getText().toString());
               length = Double.parseDouble(tvLength.getText().toString());

               Intent detailActIntent = new Intent(MainActivity.this, ResultActivity.class);
                   detailActIntent.putExtra("MAINWIDTH", width);
                   detailActIntent.putExtra("MAINLENGTH", length);
                   startActivity(detailActIntent);





           }
       });


    }
}
