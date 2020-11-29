package com.example.activty_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
private  void onFinishAvtivity(View view){
    finish();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Button button = (Button)findViewById(R.id.finishactivitybtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onFinishAvtivity(v);

            }
        });
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACTIVITY_LIFECYLE", "SecondActivity.onDestroy");
    }
}