package com.example.monu.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by vilas on 4/27/2016.
 */
public class timecategorisation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timecategorisation);

        TextView timeUpdate;
        Calendar calendar;


        timeUpdate = (TextView)findViewById(R.id.timeUpdate); //initialize in onCreate()

//in onStart()
        calendar = Calendar.getInstance();
        //date format is:  "Date-Month-Year Hour:Minutes am/pm"
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm a"); //Date and time
        String currentDate = sdf.format(calendar.getTime());


        //Day of Name in full form like,"Saturday", or if you need the first three characters you have to put "EEE" in the date format and your result will be "Sat".
        SimpleDateFormat sdf_ = new SimpleDateFormat("EEEE");
        Date date = new Date();
        String dayName = sdf_.format(date);
        //timeUpdate.setText("" + dayName + " " + currentDate + "");

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            timeUpdate.setText("Its " + dayName + " " + "Morning!!!");
            //Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();
        }else if(timeOfDay >= 12 && timeOfDay < 16){
            timeUpdate.setText("Its " + dayName + " " + "Afternoon!!!");
            //Toast.makeText(this, "Good Afternoon", Toast.LENGTH_SHORT).show();
        }else if(timeOfDay >= 16 && timeOfDay < 21){
            timeUpdate.setText("Its " + dayName + " " + "Evening!!!");
            //Toast.makeText(this, "Good Evening", Toast.LENGTH_SHORT).show();
        }else if(timeOfDay >= 21 && timeOfDay < 24){
            timeUpdate.setText("Its " + dayName + " " + "Night!!!");
            //Toast.makeText(this, "Good Night", Toast.LENGTH_SHORT).show();
        }

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