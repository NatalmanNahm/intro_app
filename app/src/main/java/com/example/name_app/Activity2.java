package com.example.name_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    //initialize
    public String mUsername = "Natalman";
    public String mPassword = "Junior228";
    public TextView mWelcomeTextView;
    public String mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Reference the textView to its appropriate field
        mWelcomeTextView = (TextView) findViewById(R.id.welcome_textView);

        //Get value sent to the activity2
        Intent intent = getIntent();
        String sentUserName = intent.getStringExtra("USERNAME");
        String sentPassword = intent.getStringExtra("PASSWORD");

        //Check the condition to see if the username and password are right
        //Then display and welcome message on the screen
        if (mUsername.equals(sentUserName) && mPassword.equals(sentPassword)){
            mMessage = "Welcome " + sentUserName;
        } else {
            mWelcomeTextView.setTextColor(Color.parseColor("#C62828"));
            mMessage = "Username and Password invalid please try again";
        }
        mWelcomeTextView.setText(mMessage);

    }
}