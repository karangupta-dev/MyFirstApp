package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartingClass extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.start);

        Thread timer=new Thread(){
        public void run(){
            try{
                sleep(3000);
            }catch (InterruptedException e)
            {e.printStackTrace(); }
            finally{
                Intent Second_Intent= new Intent("com.example.myfirstapp.MAINACTIVITY");
                startActivity(Second_Intent);           }

        }
        };
        timer.start();

    }
}
