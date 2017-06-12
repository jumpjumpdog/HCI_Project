package com.example.asus.test;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.Log;
import android.webkit.JsResult;

import java.util.Iterator;
/**
 * Created by asus on 2017/6/10.
 */
public class GetContacts extends Activity{
    private static final  String TAG = GetContacts.class.getSimpleName();
    private ArrayList<HashMap<String,String>>list;
    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        Intent intent = getIntent();
        list = getContacts();
        String phoneNumber = getPhoneNumber(intent.getStringExtra("person"));
        Log.d(TAG,intent.getStringExtra("person")+"   "+phoneNumber);
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(callIntent);
    }
    public String getPhoneNumber(String index)
    {
        ArrayList<String>finalList = new ArrayList<String>();
        ZhongZhuanYIng change = new ZhongZhuanYIng();
        String phoneNumber;
       for (HashMap<String,String> x:list){
           Iterator iterator = x.keySet().iterator();
           while (iterator.hasNext()) {
               String key = (String) iterator.next();
               String indexPin = change.getStringPinYin(index);
               String keyPin = change.getStringPinYin(key);
               if(indexPin.equals(keyPin)){
                   phoneNumber =x.get(key);
                   System.out.println("pinyin:"+keyPin+"  "+indexPin);
                   System.out.println("map.get(key) is :"+phoneNumber);
                   finalList.add(phoneNumber);
                   return phoneNumber;
               }
           }
       }
     return null;
    }
    public ArrayList<HashMap<String,String>> getContacts()
    {
        ArrayList<HashMap<String,String>>list = new ArrayList<HashMap<String,String>>();
        ContentResolver cr = getContentResolver();
        Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        //向下移动光标
        while(cursor.moveToNext())
        {
            //取得联系人名字
            int nameFieldColumnIndex = cursor.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
            String contact = cursor.getString(nameFieldColumnIndex);
            //取得电话号码
            String ContactId = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
            Cursor phone = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + ContactId, null, null);
            Log.d(TAG,contact);
            while(phone.moveToNext())
            {
                String PhoneNumber = phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                HashMap<String,String>map = new HashMap<String,String>();
                //格式化手机号
                PhoneNumber = PhoneNumber.replace("-","");
                PhoneNumber = PhoneNumber.replace(" ","");
                map.put(contact,PhoneNumber);
                list.add(map);
                Log.d(TAG, PhoneNumber);
            }

        }
        if(cursor!=null)
            cursor.close();
        return list;

    };
}
