package com.muravey.ui.quizquestions;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.muravey.R;

public class QuizQuestionsActivity extends AppCompatActivity {

    public static void start(Context context){
        context.startActivity(new Intent(context, QuizQuestionsActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question);

        QuizQuestionsActivity.start(this);
    }
}
