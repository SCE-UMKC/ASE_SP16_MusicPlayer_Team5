package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dines on 4/2/2016.
 */
public class categorisation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorisation);
    }

    public void songs1(View v)
    {
        Intent redirect = new Intent(categorisation.this,instrumentmain.class);
        startActivity(redirect);

    }
    public void songs2(View v)
    {
        Intent redirect = new Intent(categorisation.this,mainpop.class);
        startActivity(redirect);

    }
    public void songs3(View v)
    {
        Intent redirect = new Intent(categorisation.this,classicsmain.class);
        startActivity(redirect);

    }
    public void songs4(View v)
    {
        Intent redirect = new Intent(categorisation.this,mainrock.class);
        startActivity(redirect);

    }
    public void songs5(View v)
    {
        Intent redirect = new Intent(categorisation.this,maindevotional.class);
        startActivity(redirect);

    }
    public void songs6(View v)
    {
        Intent redirect = new Intent(categorisation.this,mainparty.class);
        startActivity(redirect);

    }

}