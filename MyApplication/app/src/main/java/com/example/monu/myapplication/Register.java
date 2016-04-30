package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 2/29/2016.
 */

public class Register extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

    }
    public void login(View v)
    {
        Intent redirect = new Intent(Register.this,SuccReg.class);//SuccReg
        startActivity(redirect);

    }


}
