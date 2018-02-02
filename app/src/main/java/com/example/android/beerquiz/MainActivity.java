package com.example.android.beerquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradeSubmission(View view) {
//initialize variables for answer views
        RadioButton question1_RadioButton2 = findViewById(R.id.answer_1b);
        CheckBox question2_CheckBox1 = findViewById(R.id.answer_2a);
        CheckBox question2_CheckBox2 = findViewById(R.id.answer_2b);
        CheckBox question2_CheckBox3 = findViewById(R.id.answer_2c);
        RadioButton question3_RadioButton1 = findViewById(R.id.answer_3a);
        CheckBox question4_CheckBox1 = findViewById(R.id.answer_4a);
        CheckBox question4_CheckBox2 = findViewById(R.id.answer_4b);
        CheckBox question4_CheckBox3 = findViewById(R.id.answer_4c);

//get the status of the checkboxes or radio buttons
        boolean yesQuestion1_RadioButton2 = question1_RadioButton2.isChecked();
        boolean yesQuestion2_CheckBox1 = question2_CheckBox1.isChecked();
        boolean yesQuestion2_CheckBox2 = question2_CheckBox2.isChecked();
        boolean yesQuestion2_CheckBox3 = question2_CheckBox3.isChecked();
        boolean yesQuestion3_RadioButton1 = question3_RadioButton1.isChecked();
        boolean yesQuestion4_CheckBox1 = question4_CheckBox1.isChecked();
        boolean yesQuestion4_CheckBox2 = question4_CheckBox2.isChecked();
        boolean yesQuestion4_CheckBox3 = question4_CheckBox3.isChecked();

//get string of each fill in the blank answer
        EditText answerQuestion5 = findViewById(R.id.answer_5);
        EditText answerQuestion6 = findViewById(R.id.answer_6);

//initialize variables
        int finalGrade = 0;
        boolean perfectScore = true;
        String perfectMessage = "";

//now grant score based on which value is true
        if (yesQuestion1_RadioButton2) {
            finalGrade += 1;
        } else perfectScore = false;

        if (yesQuestion2_CheckBox1 && yesQuestion2_CheckBox2 && yesQuestion2_CheckBox3) {
            finalGrade += 1;
        } else perfectScore = false;

        if (yesQuestion3_RadioButton1) {
            finalGrade += 1;
        } else perfectScore = false;

        if (yesQuestion4_CheckBox1 && yesQuestion4_CheckBox2 && !yesQuestion4_CheckBox3) {
            finalGrade += 1;
        } else perfectScore = false;

        if (answerQuestion5.getText().toString().equalsIgnoreCase("growler")) {
            finalGrade += 1;
        } else perfectScore = false;

        if (answerQuestion6.getText().toString().equalsIgnoreCase("yeast")) {
            finalGrade += 1;
        } else perfectScore = false;

//create custom message based on perfect score or not
        if (perfectScore) {
            perfectMessage = ", perfect!";
        } else perfectMessage = ", study up!";

//Display toast with score and message
        Toast.makeText(getApplicationContext(), "You scored a " + finalGrade + " out of 6" + perfectMessage, Toast.LENGTH_LONG).show();
    }

}