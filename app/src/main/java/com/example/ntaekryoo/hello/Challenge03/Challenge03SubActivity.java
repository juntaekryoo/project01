package com.example.ntaekryoo.hello.Challenge03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.ntaekryoo.hello.R;
import com.example.ntaekryoo.hello.activity.TargetActivity;

public class Challenge03SubActivity extends ActionBarActivity {

    private static final String TAG = TargetActivity.class.getSimpleName();
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge03_sub);

        //Intent intent = getIntent();

        button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), Challenge03MainActivity.class);
               startActivity(intent);
           }
       });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge03MainActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge03MainActivity.class);
                startActivity(intent);
            }
        });




    }
    }