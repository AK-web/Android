package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etChirps;
    Button btnCalculate;
    TextView tvResults;
//    DecimalFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChirps = findViewById(R.id.etChirps);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

//        formatter = new DecimalFormat("# 0.00");

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etChirps.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    int chirps = Integer.parseInt(etChirps.getText().toString().trim());

                    double temp = (chirps/3.0) + 4.0 ;
                    String Result = "The outside temp is "+ temp + " degree celsius";
//                    System.out.println("The outside temp is "+ temp);
                    tvResults.setText(Result);
                    tvResults.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}