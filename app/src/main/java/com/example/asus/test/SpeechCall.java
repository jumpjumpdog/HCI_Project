package com.example.asus.test;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUnderstander;
import com.iflytek.cloud.SpeechUnderstanderListener;
import com.iflytek.cloud.UnderstanderResult;
import com.iflytek.cloud.util.ContactManager;
import com.iflytek.cloud.util.ContactManager.ContactListener;



import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by asus on 2017/6/7.
 */
public class SpeechCall extends Activity {
    private static String TAG = SpeechCall.class.getSimpleName();
    private ArrayList<HashMap<String, String>> list;
    private String mPhone;

    @Override
    protected void onCreate(Bundle saveIstanceState) {
        super.onCreate(saveIstanceState);
        list =getContacts();
        mPhone = getPhoneNumber();
        callPhone();
    }

    private String getPhoneNumber() {
        String phoneNumber = null, person, understandResult;
        Intent intent = getIntent();
        understandResult = intent.getStringExtra("mUnderstanderResult");
        Log.d(TAG,understandResult);
        Log.d(TAG,understandResult);
        person = JsonParser.JsRusult(understandResult);
        ZhongZhuanYIng change = new ZhongZhuanYIng();
        for (HashMap<String, String> x : list) {
            Iterator iterator = x.keySet().iterator();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                String personPin = change.getStringPinYin(person);
                String keyPin = change.getStringPinYin(key);
                if (personPin.equals(keyPin)) {
                    phoneNumber = x.get(key);
                    System.out.println("pinyin:" + keyPin + "  " + personPin);
                    System.out.println("map.get(key) is :" + phoneNumber);
                    return phoneNumber;
                }
            }


        }
        return phoneNumber;
    }
    public ArrayList<HashMap<String, String>> getContacts ()
        {
            ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
            ContentResolver cr = getContentResolver();
            Cursor cursor = cr.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
            //向下移动光标
            while (cursor.moveToNext()) {
                //取得联系人名字
                int nameFieldColumnIndex = cursor.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
                String contact = cursor.getString(nameFieldColumnIndex);
                //取得电话号码
                String ContactId = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
                Cursor phone = cr.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + "=" + ContactId, null, null);
               // Log.d(TAG, contact);
                while (phone.moveToNext()) {
                    String PhoneNumber = phone.getString(phone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                    HashMap<String, String> map = new HashMap<String, String>();
                    //格式化手机号
                    PhoneNumber = PhoneNumber.replace("-", "");
                    PhoneNumber = PhoneNumber.replace(" ", "");
                    map.put(contact, PhoneNumber);
                    list.add(map);
                  //  Log.d(TAG, PhoneNumber);
                }

            }
            if (cursor != null)
                cursor.close();
            return list;
        }
    public void callPhone() {
        // 调用系统电话拨号并且把号码传递到系统拨号盘
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"
                + mPhone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    ;

    }

