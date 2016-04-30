package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by vilas on 3/30/2016.
 */
public class SongMood  extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.songmood);
        }

        public void allsongs(View v)
        {
            Intent redirect = new Intent(SongMood.this,MainActivity.class);
            startActivity(redirect);

        }
    public void allsongs2(View v)
    {
        Intent redirect = new Intent(SongMood.this,categorisation.class);

        startActivity(redirect);

    }
public void allsongs3(View v)
{
    Intent redirect = new Intent(SongMood.this,timecategorisation.class);
    startActivity(redirect);

}

}
