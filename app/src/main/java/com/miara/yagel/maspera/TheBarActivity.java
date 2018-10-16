package com.miara.yagel.maspera;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class TheBarActivity extends AppCompatActivity {


private static TextView bar_name1;
private static TextView bar_des;
private static TextView bar_p_t;
private static ImageView bar_img;

private static Button get_kod_btm;

private String[] bar_des_l;
private String[] bar_place;
private String[] bar_open_t;

private Random rand;
public static int the_kod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_bar);
        btmClickListener();
    }

        public void btmClickListener(){
            get_kod_btm=(Button) findViewById(R.id.get_kod_btm);

            get_kod_btm.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            rand=new Random();
                            the_kod=rand.nextInt(9999999)+1;
                            Toast.makeText(TheBarActivity.this,"Your kod is "+String.valueOf(the_kod),Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(getApplicationContext(), YourKodActivity.class);
                            startActivity(intent);
                        }
                    }
            );
    }
}



