package com.example.teja.inroads2vitapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SlotSelection extends AppCompatActivity {
    TextView name;
    TextView rank;
    TextView day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();
        String names = extras.getString("name");
        Long ranks = extras.getLong("rank");
        Long days = extras.getLong("day");
        name = (TextView) findViewById(R.id.nf);
        rank=(TextView) findViewById(R.id.rank);
        name.setText(names);
        rank.setText(Long.toString(ranks));





    }
}