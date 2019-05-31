package com.muravey.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.muravey.R;
import com.muravey.ui.recyclerlist.QuizListAdapter;

public class QuizListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    QuizListAdapter adapter;

    public static void start(Context context){
        context.startActivity(new Intent(context, QuizListActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);

        recyclerView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerView.setAdapter(adapter);

        QuizListActivity.start(this);
    }
}
