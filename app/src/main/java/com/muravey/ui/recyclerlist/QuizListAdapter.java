package com.muravey.ui.recyclerlist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muravey.R;


public class QuizListAdapter extends RecyclerView.Adapter<QuizListViewHolder> {


    @NonNull
    @Override
    public QuizListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_quiz_list, viewGroup, false);
        return new QuizListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizListViewHolder quizListViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
