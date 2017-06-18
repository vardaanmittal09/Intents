package com.example.android.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Integer num1=getIntent().getIntExtra("data",0);
        Integer num2=getIntent().getIntExtra("data1",0);

        Integer sum=num1+num2;
        ((TextView)findViewById(R.id.tv_other)).setText(""+sum);
    }
}
