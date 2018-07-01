package com.example.android.myquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 5;
    String finish = "You've concluded your Text,";
    String exit = "\nKeep up the Good work...";
    String message = "Begin The Text promptly, \nBest Of Luck ";
    String question1 = "What is the name of the software development-kit" +
            " for developing android application? \n a): Android++ " +
            "\n b): Android Studio \n c): Android kit \n d): Developing Android ";
    String question2 = "\n Which of the below option is an example of an object-oriented" +
            " programming language?  \n a): Java \n b): Lisp \n c): Python \n d): HTML";
    String question3 = "\n Which of this is an example of a layout view group? " +
            "\n a): Real \n b): Vertical \n c): Horizontal \n d): Relative";
    String question4 = "\n What is the other name for the SETTER method  \n a): Getter " +
            "\n b): Assignment \n c): Accessor \n d): Mutator";

    String answer1 = "A";
    String answer2 = "B";
    String answer3 = "C";
    String answer4 = "D";

    TextView valueStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueStrings = (TextView) findViewById(R.id.question_text_view);
        valueStrings.setText(message + "\n" + question1);
    }

    public String StartQuiz(View view) {
        valueStrings.setTextSize(20);
    }

    public String firstButton() {
        String questions = question1;
        if (questions == answer2) {
            valueStrings.setText("correct");
            questions = question2;
            score += 5;
        }
        valueStrings.setText(questions);
        displayScore();
        return questions;
    }

    public String secondButton() {
        String questions = question2;
        if (questions == answer1) {
            valueStrings.setText("correct");
            questions = question3;
            score += 5;
        }
        valueStrings.setText(questions);
        displayScore();
        return questions;
    }

    public String thirdButton() {
        String questions = question3;
        if (questions == answer4) {
            valueStrings.setText("correct");
            questions = question4;
            score += 5;
        }
        valueStrings.setText(questions);
        displayScore();
        return questions;
    }

    public String fourthButton() {
        String questions = question4;
        if (questions == answer3) {
            valueStrings.setText("correct");
            score += 5;
        }
        valueStrings.setText(finish);
        displayScore();
        return questions;
    }

    public void displayScore() {
        TextView scoreView = (TextView) findViewById(R.id.scoresValue_text_view);
        scoreView.setText(score);
    }

    public void Submit(View view) {
        valueStrings.setText(exit);
        displayScore();
    }
}
