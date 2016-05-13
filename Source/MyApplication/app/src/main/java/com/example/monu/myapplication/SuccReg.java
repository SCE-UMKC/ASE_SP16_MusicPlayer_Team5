package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 3/30/2016.
 */
public class SuccReg extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.successreg);
        }

        public void log3(View v)
        {
            Intent redirect = new Intent(SuccReg.this,Log.class);
            startActivity(redirect);

        }
    }

