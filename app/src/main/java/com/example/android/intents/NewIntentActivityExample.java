package com.example.android.intents;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewIntentActivityExample extends AppCompatActivity {


    EditText webaddr;
    Button btnOpenLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_intent_example);
        btnOpenLink=(Button)findViewById(R.id.btnWeb);
        webaddr=(EditText)findViewById(R.id.et_web);
        btnOpenLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linktogo=webaddr.getText().toString().trim();
                try{
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(linktogo));
                    startActivity(i);
                }
                catch (ActivityNotFoundException anfe){
                    Toast.makeText(NewIntentActivityExample.this,"Activity Not Found ",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
