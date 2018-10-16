package com.miara.yagel.maspera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * to login or get as guest or create user or forget password
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private static Button manager_btm;

    private static EditText pass_et, phone_et;//the password and username to fill for login
    private static Button login_btm;//the button to click on for login
    private static TextView forget_tv, creat_tv, guest_tv;//the textview to click on for get as guest or create user or forget password


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        clickGuestListener();
        clickForgotPass();
    }



    /*
        the function when the get as geust clicked
         */
    public void clickGuestListener() {
        pass_et = (EditText) findViewById(R.id.pass_et);
        phone_et = (EditText) findViewById(R.id.phone_et);
        login_btm = (Button) findViewById(R.id.login_btm);
        forget_tv = (TextView) findViewById(R.id.forget_tv);
        creat_tv = (TextView) findViewById(R.id.creat_tv);
        guest_tv = (TextView) findViewById(R.id.guest_tv);
        manager_btm= (Button) findViewById(R.id.manager_btm);

        guest_tv.setOnClickListener(this);
        creat_tv.setOnClickListener(this);
        login_btm.setOnClickListener(this);
        manager_btm.setOnClickListener(this);



    }


    public void clickForgotPass(){
        forget_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PopWindowActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.guest_tv:
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
                break;
            case R.id.creat_tv:
                Intent intent2 = new Intent(getApplicationContext(), CreatUserActivity.class);
                startActivity(intent2);
                break;
            case R.id.login_btm:
                if (phone_et.getText().toString().trim().equals("yagel") && pass_et.getText().toString().trim().equals("123456")) {
                    Toast.makeText(getApplicationContext(), "wellcome " + phone_et.getText() + " you can now manage your bar in buttom below", Toast.LENGTH_SHORT).show();
                    manager_btm.setVisibility(view.VISIBLE);
                }
                else
                    Toast.makeText(getApplicationContext(), "sorry but the username or password are not found ", Toast.LENGTH_SHORT).show();

                break;
            case R.id.manager_btm:
                Intent intent3 = new Intent(getApplicationContext(), ManageBarActivity.class);
                startActivity(intent3);
                break;
        }

    }

}