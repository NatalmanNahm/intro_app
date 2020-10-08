package com.example.name_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(View view){
        Log.i("INFO", "Transitioning to " + Activity2.class.getName());
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("msg", "Hello activity two");
        startActivity(intent);
    }
}