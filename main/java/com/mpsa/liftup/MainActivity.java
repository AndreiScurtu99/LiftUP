package com.mpsa.liftup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button btnCalculator;
    private Button btnInfo;
    private Button btnExercises;
    private Button btnDiet;
    private Button btnPlan;
    private Button btnHydrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = (Button) findViewById(R.id.calculatorButton);
        btnExercises = (Button) findViewById(R.id.exercisesButton);
        btnDiet = (Button) findViewById(R.id.dietButton);
        btnPlan = (Button) findViewById(R.id.schejuleButton);
        btnHydrate = (Button) findViewById(R.id.waterButton);
        btnInfo = (Button) findViewById(R.id.infoButton);

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CalculatorIntenet = new Intent(getApplicationContext(),CalculatorActivity.class);
                startActivity(CalculatorIntenet);
            }
        });
        btnExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ExercisesIntenet = new Intent(getApplicationContext(),ExercisesActivity.class);
                startActivity(ExercisesIntenet);
            }
        });
        btnDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DietIntent = new Intent(getApplicationContext(),DietActivity.class);
                startActivity(DietIntent);
            }
        });
        btnHydrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HydrateIntent = new Intent(getApplicationContext(),HydrateActivity.class);
                startActivity(HydrateIntent);
            }
        });
        btnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PlanIntent = new Intent(getApplicationContext(),PlanActivity.class);
                startActivity(PlanIntent);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InfoIntent = new Intent(getApplicationContext(),MoreinfoActivity.class);
                startActivity(InfoIntent);
            }
        });
    }
}
