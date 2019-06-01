package com.muravey.ui.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.muravey.R;
import com.muravey.ui.quiz.recycler.QuizAdapter;

public class QuizActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    QuizAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        recyclerView.findViewById(R.id.recycler_view);
        QuizAdapter adapter = new QuizAdapter();
        recyclerView.setAdapter(adapter); // set the adapter for the list

    }
}
