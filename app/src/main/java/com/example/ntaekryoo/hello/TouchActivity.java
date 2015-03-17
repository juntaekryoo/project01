package com.example.ntaekryoo.hello;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.widget.TextView;


public class TouchActivity extends ActionBarActivity {

    TextView mTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch);

        mTextView = (TextView)findViewById(R.id.textView);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        mTextView.setText(event.toString());
        return super.onTouchEvent(event);
    }
}
