package com.ubb.prodriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ubb.prodriver.other.Constants;
import com.ubb.prodriver.other.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RandomQuizActivity extends AppCompatActivity {

    private int currentQuestionIndex = 0;
    private TextView tvQuestion, tvQuestionNumber;
    private Button btnNext;
    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    private List<String> questions;
    private int correctQuestion = 0;
    private Map<String, Map<String, Boolean>> questionsAnswerMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_action);

        Intent intent = getIntent();
        String subject = intent.getStringExtra(Constants.SUBJECT);

        TextView tvTitle = findViewById(R.id.textView26);

        if (subject.equals(getString(R.string.catc))) {
            questionsAnswerMap = Utils.getRandomQuestions(this, getString(R.string.catc), Constants.QUESTION_SHOWING);
            tvTitle.setText(getString(R.string.catc_quiz));
        } else if (subject.equals(getString(R.string.catb))) {
            questionsAnswerMap = Utils.getRandomQuestions(this, getString(R.string.catb), Constants.QUESTION_SHOWING);
            tvTitle.setText(getString(R.string.catb_quiz));
        } else if (subject.equals(getString(R.string.cata))) {
            questionsAnswerMap = Utils.getRandomQuestions(this, getString(R.string.cata), Constants.QUESTION_SHOWING);
            tvTitle.setText(getString(R.string.cata_quiz));
        } else {
            questionsAnswerMap = Utils.getRandomQuestions(this, getString(R.string.catd), Constants.QUESTION_SHOWING);
            tvTitle.setText(getString(R.string.catD_quiz));
        }

        questions = new ArrayList<>(questionsAnswerMap.keySet());


        tvQuestion = findViewById(R.id.textView78);
        tvQuestionNumber = findViewById(R.id.textView18);
        btnNext = findViewById(R.id.btnNextQuestion);
        radioGroup = findViewById(R.id.radioGroup);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        findViewById(R.id.btnNextQuestion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                boolean answer = questionsAnswerMap.get(questions.get(currentQuestionIndex)).get(radioButton.getText());

                if (answer) {
                    correctQuestion++;
                }

                currentQuestionIndex++;

                if (btnNext.getText().equals(getString(R.string.next))) {
                    if ((currentQuestionIndex - correctQuestion) == 5) {
                        Intent intentResult = new Intent(RandomQuizActivity.this, FinalResultActivity.class);
                        intentResult.putExtra(Constants.SUBJECT, subject.substring(10,11));
                        intentResult.putExtra(Constants.CORRECT, correctQuestion);
                        intentResult.putExtra(Constants.INCORRECT, currentQuestionIndex - correctQuestion);
                        intentResult.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intentResult);
                        finish();
                    } else {
                        displayNextQuestions();
                    }
                } else {
                    Intent intentResult = new Intent(RandomQuizActivity.this, FinalResultActivity.class);
                    intentResult.putExtra(Constants.SUBJECT, subject);
                    intentResult.putExtra(Constants.CORRECT, correctQuestion);
                    intentResult.putExtra(Constants.INCORRECT, currentQuestionIndex - correctQuestion);
                    intentResult.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intentResult);
                    finish();
                }


            }
        });

        findViewById(R.id.imageViewStartQuiz2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        displayData();
    }

    private void displayNextQuestions() {
        setAnswersToRadioButton();
        tvQuestion.setText(questions.get(currentQuestionIndex));
        tvQuestionNumber.setText("Întrebarea curentă: " + (currentQuestionIndex + 1));

        if (currentQuestionIndex == Constants.QUESTION_SHOWING - 1) {
            btnNext.setText(getText(R.string.finish));
        }
    }

    private void displayData() {
        tvQuestion.setText(questions.get(currentQuestionIndex));
        tvQuestionNumber.setText("Întrebarea curentă: " + (currentQuestionIndex + 1));

        setAnswersToRadioButton();
    }

    private void setAnswersToRadioButton() {

        ArrayList<String> questionKey = new ArrayList(questionsAnswerMap.get(questions.get(currentQuestionIndex)).keySet());

        radioButton1.setText(questionKey.get(0));
        radioButton2.setText(questionKey.get(1));
        radioButton3.setText(questionKey.get(2));
        radioButton4.setText(questionKey.get(3));

    }

}