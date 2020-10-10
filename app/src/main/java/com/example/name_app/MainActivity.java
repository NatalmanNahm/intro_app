package com.example.name_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initialize
    public EditText mUserEdtText;
    public EditText mPasswordEditText;
    public Button mSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference EditText and button to their appropriate field
        mUserEdtText = (EditText) findViewById(R.id.username_EditText);
        mPasswordEditText = (EditText) findViewById(R.id.password_editText);
        mSubmitBtn = (Button) findViewById(R.id.submit_btn);
    }

    public void goToActivity(View view){
        Log.i("INFO", "Transitioning to " + Activity2.class.getName());

        //Get value of the EditText and format them to string
        String username = mUserEdtText.getText().toString();
        String password = mPasswordEditText.getText().toString();

        //Start activity2 and send some data over
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("USERNAME", username);
        intent.putExtra("PASSWORD", password);
        startActivity(intent);
    }
}