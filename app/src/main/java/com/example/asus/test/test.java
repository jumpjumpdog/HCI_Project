package com.example.asus.test;

import android.app.Activity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by asus on 2017/6/10.
 */
public class test extends Activity{
    private HashMap<String,String>test;
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        test = new HashMap<String,String>();
        test.put("1","jonathan");
        test.put("1","sda");
        show();
    }
    public void show()
    {
        Iterator<String> iterator =test.keySet().iterator();
        while(iterator.hasNext())
        {
            String key = iterator.next();
            String phoneNumber = test.get(key);
            System.out.println("map.get(key) is :"+phoneNumber);
        }
    }


}
