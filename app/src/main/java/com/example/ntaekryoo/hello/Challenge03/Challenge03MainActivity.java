package com.example.ntaekryoo.hello.Challenge03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.ntaekryoo.hello.Challenge05.Challenge05MainActivity;import com.example.ntaekryoo.hello.R;

public class Challenge03MainActivity extends ActionBarActivity {


    private static final String TAG = Challenge05MainActivity.class.getSimpleName();
    private static final int REQUEST_CODE_A = 0;
    private static final int REQUEST_CODE_B = 1;

    private Button mloginBtn;
    private Button button1;

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


//            //mDataMoveBtn.setOnClickListener(new View.OnClickListener()
//
//            {
//                @Override
//                public void onClick (View v){
//                Intent intent = new Intent(getApplicationContext(), TargetActivity.class);
//
//                startActivityForResult(intent, REQUEST_CODE_B);
//
//
//            }


    }
}
