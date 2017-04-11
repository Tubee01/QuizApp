package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.quizapp.R.id.editText;


public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
int points = 0;
/**
 * This method is called when the Submit Answers button is clicked
 */

public void submitAnswers(View view) {
    //Checking question 1 and rewarding it

         EditText checkAnswer = (EditText) findViewById(editText);
        String answerText = checkAnswer.getText().toString();
        if (answerText.equals("Danube")){
        points += 1;
    }
        //Checking question 2 and  rewarding it

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.the1873_radioButton);
        boolean checkedOne = radioButton1.isChecked();
        if (checkedOne) {
        points += 1;
        }

        //Checking question 3 and rewarding it

        RadioButton radioButton2 = (RadioButton) findViewById(R.id.the10_radioButton);
        boolean checkedTwo = radioButton2.isChecked();
        if (checkedTwo) {
        points += 1;
        }

        //Checking question 4 and rewarding it
         RadioButton radioButton3 = (RadioButton) findViewById(R.id.bosnnia_radioButton);
            boolean checkedThree = radioButton3.isChecked();
            if (checkedThree) {
            points += 1;
            }


        //Checking question 5 and rewarding it


        RadioButton radioButton4 = (RadioButton) findViewById(R.id.f_U_radioButton);
        boolean checkedFour = radioButton4.isChecked();
        if (checkedFour) {
        points += 1;
        }
    //Checking question 6 and rewarding it
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.the1602_1944_radioButton3);
        boolean checkedFive = radioButton5.isChecked();
        if (checkedFive) {
        points += 1;
        }
    //Checking question 7 and rewarding it
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.the1956_radioButton);
        boolean checkedSix = radioButton6.isChecked();
        if (checkedSix) {
        points += 1;
    }


    //Prevents the Submit method from being pressed more than once
        Button submitAnswer = (Button) findViewById(R.id.submitAnswer);
        submitAnswer.setClickable(false);
        //Show a toast with the score

  {
        Toast.makeText(this, "You got " + points + "/7 points!", Toast.LENGTH_LONG).show();

        }
        }
    public void resetAnswers(View v) {
        points = 0;
        EditText answer = (EditText) findViewById(editText);
        answer.setText("");
        RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup1);
        group.clearCheck();
        group = (RadioGroup) findViewById(R.id.radioGroup2);
        group.clearCheck();
        group = (RadioGroup) findViewById(R.id.radioGroup3);
        group.clearCheck();
        group = (RadioGroup) findViewById(R.id.radioGroup4);
        group.clearCheck();
        group = (RadioGroup) findViewById(R.id.radioGroup5);
        group.clearCheck();
        group = (RadioGroup) findViewById(R.id.radioGroup6);
        group.clearCheck();
    }
}


