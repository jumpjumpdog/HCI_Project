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
import android.widget.SimpleAdapter;

import com.google.gson.*;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeechFlight extends Activity {
    private String mUnderStanderResult=null;
    private ListView lv;
    private ArrayList<String> strs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_speech_flight);

        Intent intent = getIntent();
        mUnderStanderResult = intent.getStringExtra("mUnderstanderResult");
        strs = com.example.asus.test.JsonParser.parseToFlight(mUnderStanderResult);


        lv =(ListView)findViewById(R.id.listView);
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.item,new String [] {"aPort","dPort","airline","takeOffTime","arriveTime","cabinInfor"},new int[]{R.id.aPort,R.id.dPort,R.id.airline,R.id.takeOffTime,R.id.arriveTime,R.id.cabinInfor});
        lv.setAdapter(adapter);
    }

       // mUnderStanderResult = intent.getStringExtra("");
    private List<Map<String,Object>>getData()
    {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        for(int i=0;i<strs.size();)
        {
            map.put("aPort","aPort:   "+strs.get(i));
            map.put("dPort","dPort:    "+strs.get(i+1));
            map.put("airline","airline:  "+strs.get(i+2));
            map.put("takeOffTime","takeOffTime:   "+strs.get(i+3));
            map.put("arriveTime","arriveTime:    "+strs.get(i+4));
            map.put("cabinInfor","cabinInfor:  "+strs.get(i+5));
            list.add(map);
            map = new HashMap<String, Object>();
            i=i+6;
        }
        return list;
    }


}


