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
        RadioButton question1_RadioButton1 = findViewById(R.id.answer_1a);
        RadioButton question1_RadioButton2 = findViewById(R.id.answer_1b);
        CheckBox question2_CheckBox1 = findViewById(R.id.answer_2a);
        CheckBox question2_CheckBox2 = findViewById(R.id.answer_2b);
        CheckBox question2_CheckBox3 = findViewById(R.id.answer_2c);
        RadioButton question3_RadioButton1 = findViewById(R.id.answer_3a);
        RadioButton question3_RadioButton2 = findViewById(R.id.answer_3b);
        RadioButton question3_RadioButton3 = findViewById(R.id.answer_3c);
        CheckBox question4_CheckBox1 = findViewById(R.id.answer_4a);
        CheckBox question4_CheckBox2 = findViewById(R.id.answer_4b);
        CheckBox question4_CheckBox3 = findViewById(R.id.answer_4c);

//get the status of the checkboxes or radio buttons
        boolean yesQuestion1_RadioButton2 = question1_RadioButton2.isChecked();
        boolean yesQuestion2_CheckBox1 = question2_CheckBox1.isChecked();
        boolean yesQuestion2_CheckBox2 = question2_CheckBox2.isChecked();
        boolean yesQuestion2_CheckBox3 = question2_CheckBox3.isChecked();
        boolean yesQuestion3_RadioButton1 = question3_RadioButton1.isChecked();
        boolean yesQuestion3_RadioButton2 = question3_RadioButton2.isChecked();
        boolean yesQuestion3_RadioButton3 = question3_RadioButton3.isChecked();
        boolean yesQuestion4_CheckBox1 = question4_CheckBox1.isChecked();
        boolean yesQuestion4_CheckBox2 = question4_CheckBox2.isChecked();
        boolean yesQuestion4_CheckBox3 = question4_CheckBox3.isChecked();

//get string of each fill in the blank answer
        EditText answerQuestion5 = findViewById(R.id.answer_5);
        EditText answerQuestion6 = findViewById(R.id.answer_6);


//now grant score based on which value is true
        int finalGrade = 0;

        if (yesQuestion1_RadioButton2) {
            finalGrade += 1;
        }

        if(yesQuestion2_CheckBox1 && yesQuestion2_CheckBox2 && yesQuestion2_CheckBox3) {
            finalGrade += 1;
        }

        if (yesQuestion3_RadioButton1) {
            finalGrade += 1;
        }

        if(!yesQuestion4_CheckBox1 && yesQuestion4_CheckBox2 && !yesQuestion4_CheckBox3) {
            finalGrade += 1;
        }

        if (answerQuestion5.getText().toString() == "growler") {
            finalGrade += 1;
        }

        if (answerQuestion6.getText().toString() == "yeast") {
            finalGrade += 1;
        }

        Toast.makeText(getApplicationContext(), "You scored a " + finalGrade + " out of 6", Toast.LENGTH_LONG).show();
    }

}
