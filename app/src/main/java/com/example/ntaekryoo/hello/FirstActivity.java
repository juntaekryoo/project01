package com.example.ntaekryoo.hello;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class FirstActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(getApplicationContext(), "재완이는 엄마를 사랑해", Toast.LENGTH_SHORT).show();
    }

    public void onButton2Clicked(View v) {
        Toast.makeText(getApplicationContext(), "진이는 엄마를 사랑해", Toast.LENGTH_SHORT).show();
    }

    public void onButton3Clicked(View v) {
        Toast.makeText(getApplicationContext(), "아빠는 엄마를 사랑해", Toast.LENGTH_SHORT).show();
    }

    public void onButton4Clicked(View v) {
        Toast.makeText(getApplicationContext(), "아빠는 엄마를 사랑해", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
