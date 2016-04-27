package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 4/27/2016.
 */
public class timecategorisation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timecategorisation);
    }

    public void songs1(View v)
    {
        Intent redirect = new Intent(timecategorisation.this,morning.class);
        startActivity(redirect);

    }
    public void songs2(View v)
    {
        Intent redirect = new Intent(timecategorisation.this,afternoon.class);
        startActivity(redirect);

    }
    public void songs3(View v)
    {
        Intent redirect = new Intent(timecategorisation.this,evening.class);
        startActivity(redirect);

    }
    public void songs4(View v)
    {
        Intent redirect = new Intent(timecategorisation.this,night.class);
        startActivity(redirect);

    }

}