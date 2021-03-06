package com.example.rabiah.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddEmployee extends AppCompatActivity {


    private EditText employeeEmailID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        employeeEmailID=(EditText)findViewById(R.id.addEmployeeEmail);

    }

    public void sendEmail(View v)
    {
        String email=employeeEmailID.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, "TrackerSignUpRequest");
        intent.putExtra(Intent.EXTRA_TEXT, "Dear User, Your employer has requested you to sign up for Tracker. Your company code is 12543. Please sign up.");

        startActivity(Intent.createChooser(intent, "Send Email"));

    }

    @Override
    public void onBackPressed() {
    }
}
