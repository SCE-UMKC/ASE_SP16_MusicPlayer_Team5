package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 3/5/2016.
 */
public class Login extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }
    public void register(View v)
    {
        Intent redirect = new Intent(Login.this,Register.class);
        startActivity(redirect);

    }

}
