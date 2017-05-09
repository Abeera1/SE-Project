package com.example.acer.navigation;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Call extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    EditText et1;
    Button b1;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        init();
    }

    private void init() {
        b1 = (Button) findViewById(R.id.button1);
        et1 = (EditText) findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Calling to" + et1.getText().toString() + "...", Toast.LENGTH_SHORT);
            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:" + et1.getText().toString()));
            if (ContextCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(Call.this, new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }else{
                startActivity(i);
            }

        }

    });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case REQUEST_CALL:
            {
                if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startActivity(i);
                }else{
                    ////
                }
            }
        }

    }
}



