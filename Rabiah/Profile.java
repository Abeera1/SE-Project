package com.example.rabiah.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Profile extends AppCompatActivity implements OnClickListener {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        b1 = (Button)findViewById(R.id.phone);
        b2 = (Button)findViewById(R.id.message);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.phone){
            Intent i = new Intent(this,Call.class);
            startActivity(i);
        }
        if(v.getId() == R.id.message){
            Intent i = new Intent(this,Message.class);
            startActivity(i);
        }
    }
    @Override
    public void onBackPressed() {
    }
}
