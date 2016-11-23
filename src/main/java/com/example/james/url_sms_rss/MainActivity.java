package com.example.james.url_sms_rss;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmsManager mySMS = SmsManager.getDefault();
        String destination = "16501234567";
        String msg = "Sending my first message";
        mySMS.sendTextMessage(destination, null, msg, null, null);
        String SENT_SMS_FLAG = "SENT_SMS";
        String DELIVER_SMS_FLAG = "DELIVER_SMS";
        Intent sentIn = new Intent(SENT_SMS_FLAG);
        PendingIntent sentPIn = PendingIntent.getBroadcast(this,0,sentIn,0);
        Intent deliverIn = new Intent(SENT_SMS_FLAG);
        PendingIntent deliverPIn
                = PendingIntent.getBroadcast(this,0,deliverIn,0);

        BroadcastReceiver sentReceiver = new BroadcastReceiver(){
            @Override public void onReceive(Context c, Intent in) {
                switch(getResultCode()){
                    case Activity.RESULT_OK:
        //sent SMS message successfully;
                        break;
                    default:
        //sent SMS message failed
                        break;
                }
            }
        };
        BroadcastReceiver deliverReceiver = new BroadcastReceiver(){
            @Override public void onReceive(Context c, Intent in) {
//SMS delivered actions
            }
        };
        registerReceiver(sentReceiver, new IntentFilter(SENT_SMS_FLAG));
        registerReceiver(deliverReceiver, new IntentFilter(DELIVER_SMS_FLAG));
        ArrayList<String> multiSMS = mySMS.divideMessage(msg);
        ArrayList<PendingIntent> sentIns = new ArrayList<PendingIntent>();
        ArrayList<PendingIntent> deliverIns = new ArrayList<PendingIntent>();
        for(int i=0; i< multiSMS.size(); i++){
            sentIns.add(sentIn);
            deliverIns.add(deliverIn);
        }
        mySMS.sendMultipartTextMessage(destination, null,
                multiSMS, sentIns, deliverIns);
        try{
            String url = "http://www.stackoverflow.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
