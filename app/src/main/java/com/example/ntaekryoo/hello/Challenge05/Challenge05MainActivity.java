package com.example.ntaekryoo.hello.Challenge05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.ntaekryoo.hello.Challenge03.Challenge03SubActivity;
import com.example.ntaekryoo.hello.R;
import com.example.ntaekryoo.hello.activity.TargetActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge05MainActivity extends ActionBarActivity {


    private static final String TAG = Challenge05MainActivity.class.getSimpleName();
    private static final int REQUEST_CODE_A = 0;
    private static final int REQUEST_CODE_B = 1;

    private Button mloginBtn;
    private Button mdatedataBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge03_main);

        mloginBtn = (Button) findViewById(R.id.loginBtn);

        mloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge03SubActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy 년 MM 월 dd 일");
        Date today = new Date();
        String dateString = formatter.format(today);
        System.out.println(dateString);

        mdatedataBtn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TargetActivity.class);

                startActivityForResult(intent, REQUEST_CODE_B);


            }


        });
    }
}
