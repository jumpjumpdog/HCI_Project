package com.example.asus.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SpeechWeb extends Activity {
    private static final String TAG= SpeechWeb.class.getSimpleName();
    private String mUnderstanderResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        mUnderstanderResult = intent.getStringExtra("mUnderstanderResult");
        Log.d(TAG,mUnderstanderResult);
    }

}
