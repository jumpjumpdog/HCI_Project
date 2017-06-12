package com.example.asus.test;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUnderstander;
import com.iflytek.cloud.SpeechUnderstanderListener;
import com.iflytek.cloud.UnderstanderResult;
import com.iflytek.cloud.util.ContactManager;

import java.io.FileWriter;

/**
 * Created by asus on 2017/6/7.
 */
public class SelectActivity extends Activity implements View.OnClickListener {
    private static final String TAG = SelectActivity.class.getSimpleName();
    private SpeechUnderstander mSpeechUnderstander;
    private String mUnderstanderResult;
    private UnderstanderResult mJsonUnderResult;
    private ContactManager mgr;
    private Toast toast;

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.selectpage);

        mSpeechUnderstander = SpeechUnderstander.createUnderstander(SelectActivity.this, null);
        mSpeechUnderstander.setParameter(SpeechConstant.ENGINE_TYPE, "cloud");

        mgr = ContactManager.createManager(SelectActivity.this, mContactListener);
        mgr.asyncQueryAllContactsName();

        toast =Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);

        initLayout();

        mSpeechUnderstander.startUnderstanding(mUnderStanderLIstener);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {

            case R.id.web:
                intent = new Intent(SelectActivity.this, SpeechWeb.class);
                break;
            case R.id.dial:
                intent = new Intent(SelectActivity.this, SpeechCall.class);
                break;
            case R.id.flight:
                intent = new Intent(SelectActivity.this, SpeechFlight.class);
                break;
        }

        if (intent != null) {
            intent.putExtra("mUnderstanderResult", mUnderstanderResult);
            //intent.putExtra("mJsonUnderResult",mJsonUnderResult.toString());
            startActivity(intent);
        }

    }

    private void initLayout() {
        findViewById(R.id.web).setOnClickListener(SelectActivity.this);
        findViewById(R.id.dial).setOnClickListener(SelectActivity.this);
        findViewById(R.id.flight).setOnClickListener(SelectActivity.this);
    }

    private SpeechUnderstanderListener mUnderStanderLIstener = new SpeechUnderstanderListener() {
        @Override
        public void onVolumeChanged(int i, byte[] bytes) {

        }

        @Override
        public void onBeginOfSpeech() {
            Log.d(TAG,"开始录音");
            toast.setText("正在录音");
            toast.show();
        }

        @Override
        public void onEndOfSpeech() {
                toast.setText("取消录音");
                toast.cancel();
        }

        @Override
        public void onResult(UnderstanderResult understanderResult) {
            if (null != understanderResult) {
                mJsonUnderResult=understanderResult;
                mUnderstanderResult = understanderResult.getResultString();
                Log.d(TAG,understanderResult.getResultString());
                System.out.println(understanderResult.getResultString());
//                try {
//
//                    FileWriter fw = new FileWriter(getApplicationContext().getPackageResourcePath() +"/aa.txt");
//                    fw.flush();
//                    fw.write(understanderResult.getResultString());
//                    fw.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                //  显示

//               String phoneNumber =  mContact.getPhoneNumber(person);
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
            }
        }

        @Override
        public void onError(SpeechError speechError) {

        }

        @Override
        public void onEvent(int i, int i1, int i2, Bundle bundle) {

        }
    };
    private ContactManager.ContactListener mContactListener = new ContactManager.ContactListener() {
        @Override
        public void onContactQueryFinish(String s, boolean b) {
            runOnUiThread(new Runnable() {
                public void run(){

                }
            });
        }
    };

}
