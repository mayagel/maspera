package com.miara.yagel.maspera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.*;
import java.util.Scanner;

/**
the activity of the page to create user
 */

public class CreatUserActivity extends AppCompatActivity {

    private static EditText phone_et_c, sex_et_c, pass_et_c1, pass_et_c2;
    private static TextView sms_kod;
    private static Button creat_btm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_user);
        declareVari();
        ClickCreatB();


    }

    public void declareVari(){
        phone_et_c=(EditText) findViewById(R.id.phone_et_c);
        sex_et_c=(EditText) findViewById(R.id.sex_et_c);
        pass_et_c1=(EditText) findViewById(R.id.pass_et_c1);
        pass_et_c2=(EditText) findViewById(R.id.pass_et_c2);

        sms_kod=(TextView) findViewById(R.id.sms_kod);

        creat_btm=(Button) findViewById(R.id.creat_btm);


    }

    public void ClickCreatB(){
        creat_btm.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {

                String phone=phone_et_c.getText().toString();
                String sex=sex_et_c.getText().toString();
                String pass1=pass_et_c1.getText().toString();
                String pass2=pass_et_c2.getText().toString();

                if (isValid(phone,sex,pass1,pass2)){
                    sms_kod.setVisibility(View.INVISIBLE);
                    startActivity(new Intent(CreatUserActivity.this, PopSmsActivity.class));



                }
                else {
                    sms_kod.setVisibility(View.VISIBLE);
                }
            }
        });
    }



    public boolean isValid(String phone,String sex ,String pass1,String pass2)
    {
        if (phone.isEmpty()||sex.isEmpty()||pass1.isEmpty()||pass2.isEmpty()){
            Toast.makeText(getApplicationContext(), "some of the neccery field is empty " , Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!(phone.length()==10&&phone.charAt(0)=='0'&&phone.charAt(1)=='5')){
            Toast.makeText(getApplicationContext(), "input real phone number " , Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!(pass1.equals(pass2))){
            Toast.makeText(getApplicationContext(), "the password dont match " , Toast.LENGTH_SHORT).show();
            return false;
        }
        if (pass1.length()<5){
            Toast.makeText(getApplicationContext(), "the password need to be more then 5 notes " , Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }


}
