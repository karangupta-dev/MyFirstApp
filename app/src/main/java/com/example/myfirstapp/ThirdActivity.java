package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends Activity {

    EditText user,pass1,pass2;
    Button btn;
    String name, pwd1,pwd2;
    TextView txt,txt1;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        img=(ImageView)findViewById(R.id.img);
        txt1=(TextView)findViewById(R.id.user);
        user=(EditText)findViewById(R.id.username);
        pass1=(EditText)findViewById(R.id.pass1);
        pass2=(EditText)findViewById(R.id.pass2);
        btn=(Button)findViewById(R.id.Register);
        txt=(TextView)findViewById(R.id.text);

//          TO SHOW AN IMAGE ON CLICK OF A BUTTON
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                name = String.valueOf(user.getText());
                pwd1= String.valueOf(pass1.getText());
                pwd2= String.valueOf(pass2.getText());
                txt1.setText(""+name);
                if(pwd1.equalsIgnoreCase("Karan123")&&pwd1.equals(pwd2))
                {
                    img.setImageResource(R.drawable.thug);
                    txt.setText("Match ho gya");
                }
                else{
                    txt.setText("no match");
                }

            }

        });

    }


}

