package com.example.rabiah.tracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button signin;
    Button signupEmployer;
    Button signupEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=(Button)findViewById(R.id.signin);
        signupEmployer=(Button)findViewById(R.id.signupEmployer);
        signupEmployee=(Button)findViewById(R.id.signupEmployee);
        signin.setOnClickListener(this);
        signupEmployer.setOnClickListener(this);
        signupEmployee.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.signin)
        {
            Intent i=new Intent(this,Login.class);
            startActivity(i);
        }
        if(v.getId()==R.id.signupEmployer){
            Intent j=new Intent(this,SignUpAsEmployer.class);
            startActivity(j);
        }
        if(v.getId()==R.id.signupEmployee){
            Intent j=new Intent(this,SignUpAsEmployee.class);
            startActivity(j);
        }
    }

}
