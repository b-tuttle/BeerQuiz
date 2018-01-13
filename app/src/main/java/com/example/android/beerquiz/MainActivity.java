package com.example.android.beerquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Initializes the score to 0 */
    int score = 0;

    /**
     * Grades question #1
     * Checks that the correct answers, B and C, are checked
     *
     * @param score the current score
     * @return score is returned after being incremented if answer is correct
     */
    public int checkAnswer1(int score) {
        CheckBox isChecked_2a = findViewById(R.id.answer_2a);
        boolean answer_2a = isChecked_2a.isChecked();
        CheckBox isChecked_2b = findViewById(R.id.answer_2b);
        boolean answer_2b = isChecked_2b.isChecked();
        CheckBox isChecked_2c = findViewById(R.id.answer_2c);
        boolean answer_2c = isChecked_2c.isChecked();

        int i = 0;

        if (!answer_2a) {
            i += 1;
        }
        if (answer_2b) {
            i += 1;
        }
        if (answer_2c) {
            i += 1;
        }
        if (i == 3) {
            score += 1;
        }
        return score;
    }

    /**
     * Grades question #5
     * Checks that the correct answers, A and C, are checked
     *
     * @param score the current score
     * @return score is returned after being incremented if answer is correct
     */
    public int checkAnswer5(int score) {
        CheckBox isChecked_5a = findViewById(R.id.answer_5a);
        boolean answer_5a = isChecked_5a.isChecked();
        CheckBox isChecked_5b = findViewById(R.id.answer_5b);
        boolean answer_5b = isChecked_5b.isChecked();
        CheckBox isChecked_5c = findViewById(R.id.answer_5c);
        boolean answer_5c = isChecked_5c.isChecked();

        int i = 0;

        if (answer_5a) {
            i += 1;
        }
        if (!answer_5b) {
            i += 1;
        }
        if (answer_5c) {
            i += 1;
        }
        if (i == 3) {
            score += 1;
        }
        return score;
    }


    /**
     * When Submit Answers button is pressed, runs a check on each answer given and gives the user a toast of their score
     *
     *
     *
     */
    private void gradeSubmission() {
        checkAnswer1(score);
        checkAnswer2(score);
        checkAnswer3(score);
        checkAnswer4(score);
        checkAnswer5(score);
        checkAnswer6(score);

        Toast.makeText(getApplicationContext(), "You scored a " + score + "out of 6", Toast.LENGTH_SHORT).show();

    }

}
