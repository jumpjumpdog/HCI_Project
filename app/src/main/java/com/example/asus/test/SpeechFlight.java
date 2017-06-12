package com.example.asus.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;

import com.google.gson.*;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class SpeechFlight extends Activity {
    private String mUnderStanderResult=null;
    private ListView lv;
    private ArrayList<String> strs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech_flight);

        Intent intent = getIntent();
        mUnderStanderResult = intent.getStringExtra("mUnderstanderResult");
        strs = com.example.asus.test.JsonParser.parseToFlight(mUnderStanderResult);
        lv =(ListView)findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs));
    }
       // mUnderStanderResult = intent.getStringExtra("");

    private void processFunc()
    {
        String aPort,dPort,airPlane;
        List<FlightBean.DataBean.ResultBean> mResultDataArray;

        for(String x:strs)
        {
            strs.add(x);
        }
    }

}


