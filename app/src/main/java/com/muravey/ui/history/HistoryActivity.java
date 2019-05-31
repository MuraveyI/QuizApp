package com.muravey.ui.history;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.muravey.R;
import com.muravey.ui.main.MainActivity;

public class HistoryActivity extends AppCompatActivity {

    public static void start(Context context){
        context.startActivity(new Intent(context, HistoryActivity.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        HistoryActivity.start(this);
    }
}
