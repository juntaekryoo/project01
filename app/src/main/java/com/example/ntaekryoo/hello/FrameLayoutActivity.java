
package com.example.ntaekryoo.hello;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayoutActivity extends ActionBarActivity {

    Button mChangeButton;
    ImageView mImage1;
    ImageView mImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        mChangeButton = (Button)findViewById(R.id.changeBtn);
        mImage1 = (ImageView)findViewById(R.id.image1);
        mImage2 = (ImageView)findViewById(R.id.image2);

        mChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mImage1.getVisibility() == View.VISIBLE) {
                    mImage1.setVisibility(View.INVISIBLE);
                    mImage2.setVisibility(View.VISIBLE);
                } else {
                    mImage2.setVisibility(View.INVISIBLE);
                    mImage1.setVisibility(View.VISIBLE);
                }

            }
        });
    }


    
}
