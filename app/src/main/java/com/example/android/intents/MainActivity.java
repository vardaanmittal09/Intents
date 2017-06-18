package com.example.android.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMain,etMain2;
    public static final String TAG ="MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMain=(EditText)findViewById(R.id.et_main);
        etMain2=(EditText)findViewById(R.id.et_main2);
        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,OtherActivity.class);
                Integer num1=Integer.valueOf(etMain.getText().toString());
                Integer num2=Integer.valueOf(etMain2.getText().toString());
                i.putExtra("data",num1);
                i.putExtra("data1",num2);
                startActivity(i);
                //finish(); // Destroys the activity Cannot go back to the previous activity App exits



            }
        });
        ((Button)findViewById(R.id.btnbrow)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,NewIntentActivityExample.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart:=====");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume:=====");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause:=====");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop:=====");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy:=====");
    }

}
