package com.marswin89.marsdaemon.demo;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

/**
 * This Service is Persistent Service. Do some what you want to do here.<br/>
 * <p>
 * Created by Mars on 12/24/15.
 */
public class Service1 extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO do some thing what you want..
        Log.e("onCreate","111111111111111111111111");
    }

    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            // 要做的事情

            Log.e("111111111111111","111111111111111111111111");
            super.handleMessage(msg);
        }
    };

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("1111112222222111111111","111111111111111111111111");
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10000);// 线程暂停10秒，单位毫秒
                        Message message = new Message();
                        message.what = 1;
                        handler.sendMessage(message);// 发送消息
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    super.run();

                }
            }
        }.start();
        return super.

                onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
