package com.example.asus.test;

/**
 * Created by asus on 2017/6/4.
 */
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import android.util.Log;
import com.example.asus.test.ZhongZhuanYIng;
import com.google.gson.annotations.JsonAdapter;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Json结果解析类
 */
public class JsonParser {
    private static final  String TAG = JsonParser.class.getSimpleName();

    public  static String JsRusult(String jsonString){
        String peopleName="";
        ZhongZhuanYIng change = new ZhongZhuanYIng();
        try
        {
            Log.d(TAG,jsonString);
            JSONTokener tokener = new JSONTokener(jsonString);
            JSONObject joResult = new JSONObject(tokener);
            JSONArray words = joResult.getJSONArray("semantic");
            JSONObject obj = words.getJSONObject(0);
            Log.d(TAG,obj.toString());
            String name = obj.getJSONArray("slots").getJSONObject(0).getString("value");
            Log.d(TAG,name);

           peopleName = change.getStringPinYin(name);
           Log.e(TAG,peopleName);
            return peopleName;

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        return peopleName;
    }

public static ArrayList<String> parseToFlight(String json){
    ArrayList<String> temp = new ArrayList<String>();
    try
    {
        JSONTokener tokener = new JSONTokener(json);
        JSONObject jsonObject = new JSONObject(tokener),tempObject;
        String aPort,dPort,airLine,takeOffTime,arriveTime,cabinInfor;
        JSONArray jsonResult = jsonObject.getJSONObject("data").getJSONArray("result");

        Log.d(TAG,jsonResult.toString());
        for(int i=0;i<jsonResult.length();i++)
        {
            Log.d(TAG,"tempObject");
            tempObject = jsonResult.getJSONObject(i);
            Log.d(TAG,jsonResult.getJSONObject(i).toString());
            aPort = tempObject.getString("aPort");
            dPort = tempObject.getString("dPort");
            airLine = tempObject.getString("airline");
            takeOffTime = tempObject.getString("takeOffTime");
            arriveTime = tempObject.getString("arriveTime");
            cabinInfor= tempObject.getString("cabinInfo");

            temp.add(aPort);
            temp.add(dPort);
            temp.add(airLine);
            temp.add(takeOffTime);
            temp.add(arriveTime);
            temp.add(cabinInfor);
        }
        return temp;
    }
    catch (Exception e){
        e.printStackTrace();
    }
   return temp;
}

    public static Map<String,String> parseToWeather(String json)
    {
        Map<String,String> temp = new HashMap<String,String>();
        try
        {
            JSONTokener tokener = new JSONTokener(json);
            JSONObject jsonObject = new JSONObject(tokener),tempObject;
            String city,tempRange,weather,wind,prompt;
            JSONArray jsonResult = jsonObject.getJSONObject("data").getJSONArray("result");

            city = jsonResult.getJSONObject(1).getString("city");
            tempRange=jsonResult.getJSONObject(1).getString("tempRange");
            weather=jsonResult.getJSONObject(1).getString("weather");
            wind=jsonResult.getJSONObject(1).getString("wind");
            prompt=jsonResult.getJSONObject(0).getJSONObject("exp").getJSONObject("ct").getString("prompt");

            temp.put("city",city);
            temp.put("tempRange",tempRange);
            temp.put("weather",weather);
            temp.put("wind",wind);
            temp.put("prompt",prompt);
            return temp;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }

}