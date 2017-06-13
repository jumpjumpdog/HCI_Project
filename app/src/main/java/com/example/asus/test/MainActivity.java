package com.example.asus.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;
import com.iflytek.cloud.util.ContactManager;
import com.iflytek.cloud.util.ContactManager.ContactListener;

public class MainActivity extends Activity implements OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SpeechUtility.createUtility(MainActivity.this, "appid=592ba95e");
        setContentView(R.layout.activity_main);
        initLayout();

    }

    @Override
    public void onClick(View view){
        Log.d(TAG, "enter mainactivity click");
        Intent intent = null;
        switch (view.getId()){
            case R.id.icon:
                Log.d(TAG,"按钮按下");
                intent = new Intent(MainActivity.this,SelectActivity.class);
                break;
                }
        if (intent != null) {
            startActivity(intent);
        }
    }
    /**
     * 初始化Layout。
     */
    private void initLayout(){
        findViewById(R.id.icon).setOnClickListener(MainActivity.this);
    }


}