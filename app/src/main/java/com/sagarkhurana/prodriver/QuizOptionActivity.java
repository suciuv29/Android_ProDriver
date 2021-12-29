package com.sagarkhurana.prodriver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sagarkhurana.prodriver.other.Constants;

public class QuizOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_option);

        CardView cvCatA = findViewById(R.id.cvCatA);
        CardView cvCatB = findViewById(R.id.cvCatB);
        CardView cvCatC = findViewById(R.id.cvCatC);
        CardView cvCatD = findViewById(R.id.cvCatD);


        findViewById(R.id.imageViewQuizOption).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cvCatA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, RandomQuizActivity.class);
                intent.putExtra(Constants.SUBJECT, getString(R.string.cata));
                startActivity(intent);
            }
        });

        cvCatB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, RandomQuizActivity.class);
                intent.putExtra(Constants.SUBJECT, getString(R.string.catb));
                startActivity(intent);
            }
        });

        cvCatC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, RandomQuizActivity.class);
                intent.putExtra(Constants.SUBJECT, getString(R.string.catc));
                startActivity(intent);
            }
        });

        cvCatD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, RandomQuizActivity.class);
                intent.putExtra(Constants.SUBJECT, getString(R.string.catd));
                startActivity(intent);
            }
        });

    }
}