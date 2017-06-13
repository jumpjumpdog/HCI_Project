package com.example.asus.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by asus on 2017/6/13.
 */
public class SpeechWeather extends Activity  {
    private String mUnderStanderResult=null;
    private ListView lv;
    private Map<String,String>strs;
    private TextView city;
    private TextView tempRange;
    private TextView weather;
    private TextView wind;
    private TextView prompt;

    @Override
    protected   void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.speechweather);

        Intent intent = getIntent();
        mUnderStanderResult = intent.getStringExtra("mUnderstanderResult");
        strs = com.example.asus.test.JsonParser.parseToWeather(mUnderStanderResult);

        bindView();
        initView();
    }

    private void bindView()
    {
        city = (TextView)findViewById(R.id.city );
        tempRange =(TextView)findViewById(R.id.tempRange );
        weather = (TextView)findViewById(R.id.weather );
        wind=(TextView)findViewById(R.id.wind );
        prompt =(TextView)findViewById(R.id.prompt);
    }

    private  void initView()
    {
        city.setText(strs.get("city"));
        tempRange.setText(strs.get("tempRange"));
        weather.setText(strs.get("weather"));
        wind.setText(strs.get("wind"));
        prompt.setText(strs.get("prompt"));
    }
}
