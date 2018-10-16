package com.miara.yagel.maspera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class YourKodActivity extends AppCompatActivity {

    private TextView the_kod;
    private TextView the_end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_kod);
        theKod();
        theEnd();
    }
    public void theKod(){
        the_kod=(TextView) findViewById(R.id.the_kod);
        the_kod.setText(String.valueOf(TheBarActivity.the_kod));
    }


    public void theEnd(){
        the_end=(TextView) findViewById(R.id.the_end);
        the_end.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        YourKodActivity.this.moveTaskToBack(true);
                    }
                }
        );
    }

}
