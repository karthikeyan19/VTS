package com.example.karthik.gpshoptial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Main4Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main4);

        int secdelay=3;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(i);
                finish();
            }

        },secdelay*1000);
    }
    }


