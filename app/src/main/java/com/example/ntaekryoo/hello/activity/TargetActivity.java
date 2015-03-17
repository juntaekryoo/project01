package com.example.ntaekryoo.hello.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.ntaekryoo.hello.R;

public class TargetActivity extends ActionBarActivity {

    private static final String TAG = TargetActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);


        Intent intent = getIntent();

        if (intent != null) {
            String value = intent.getStringExtra("key");
            if (TextUtils.isEmpty(value) == false) {
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        }

        findViewById(R.id.moveBtn2).setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityExamActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        findViewById(R.id.finishBtn).setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data", "smartapp");

                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
