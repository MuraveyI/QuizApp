package com.muravey;

import android.app.Application;

import com.muravey.data.QuizRepository;

public class App extends Application {

    public static QuizRepository repository;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
