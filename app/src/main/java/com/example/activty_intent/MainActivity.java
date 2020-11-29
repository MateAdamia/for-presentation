package com.example.activty_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void onSecondActivity(View view) {
        Log.i("INFO", "SECOND ACTIVITY");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }
    private void onIntent(View view) {

        Intent sendingintent = new Intent();
        sendingintent.setAction(Intent.ACTION_SEND);
        sendingintent.putExtra("MESSAGE", "INTENT");
        sendingintent.setType("text/plain"); //MIME

        Intent windowChooser = Intent.createChooser(sendingintent,"CHOOSe:");
        if (sendingintent.resolveActivity(getPackageManager()) != null) {
            startActivity(windowChooser);

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Intentbtn = (Button)findViewById(R.id.intentbtn);
        Intentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onIntent(v);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVITY_LIFECYLE", "MainActivity.onStart");

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("ACTIVITY_LIFECYCLE","MainActivity.onRestart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVITY_LIFECYLE", "MainActivity.onStop");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVITY_LIFECYLE", "MainActivity.onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVITY_LIFECYLE", "MainActivity.onResume");
    }
}