package com.marswin89.marsdaemon.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 *
 * Created by Mars on 12/24/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //you have to start the service once.
        startService(new Intent(MainActivity.this, Service1.class));
        Log.e("1111112222222111111111","111111111111111111111111");
    }
}
