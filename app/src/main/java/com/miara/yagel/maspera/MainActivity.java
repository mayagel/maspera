package com.miara.yagel.maspera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * this activity meant to be a splash screen
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //the splash screen
        Thread mythread = new Thread(){
                @Override
                public void run(){
                    try {
                        sleep(3000);
                        Intent intent = new Intent(getApplicationContext(), com.miara.yagel.maspera.LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            mythread.start();
        }
    }
