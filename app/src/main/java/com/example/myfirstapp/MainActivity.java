package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    static int counter;
    Button inc,dec,imgbtn,next;
    TextView display,textField;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inc=(Button)findViewById(R.id.inc); //Increase Button
        dec=(Button)findViewById(R.id.dec); //Decrease Button
        imgbtn=(Button)findViewById(R.id.imgButton);    //Image Button
        display=(TextView)findViewById(R.id.result);    //Score
        textField=(TextView)findViewById(R.id.textField1);  //Toggling Message
        img=(ImageView)findViewById(R.id.image);    //Image View
        next=(Button)findViewById(R.id.next); //Next Button
/*  TO SHOW AN IMAGE ON CLICK OF A BUTTON */
        imgbtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                img.setImageResource(R.drawable.f);

            }

        });

        inc.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                counter++;
                display.setText("Score is:" + "" + counter);

                if(counter==2){

                    textField.setVisibility(View.VISIBLE);
                    textField.setText("Abi to development shuru hui hai");

                }else if(counter==-2)
                {
                 textField.setVisibility(View.INVISIBLE);
                }

            }

        });

        dec.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                counter--;
                display.setText("Score is:"+""+counter);

                if(counter==2){

                    textField.setVisibility(View.VISIBLE);
                    textField.setText("Abi to development shuru hui hai");

                }else if(counter==-2)
                {
                    textField.setVisibility(View.INVISIBLE);
                }

            }

        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent("com.example.myfirstapp.THIRDACTIVITY");
                startActivity(i);

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
