package com.example.consultants.week3_daily3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    public static String STARTFOREGROUND_ACTION = "com.example.consultants.week3_daily3.startforeground";
    public static String STOPFOREGROUND_ACTION = "com.example.consultants.week3_daily3.stopforeground";
    private static final String TAG = MainActivity.class.getSimpleName() +"_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onStart(View view) {
        Log.d(TAG, "onClick: ");
        Intent startIntent = new Intent(MainActivity.this, Foreground_service.class);
        startIntent.setAction(STARTFOREGROUND_ACTION);
        startService(startIntent);
    }

    public void onStop(View view) {
        Log.d(TAG, "onClick: ");
        Intent stopIntent = new Intent(MainActivity.this, Foreground_service.class);
        stopIntent.setAction(STOPFOREGROUND_ACTION);
        startService(stopIntent);
    }
}
