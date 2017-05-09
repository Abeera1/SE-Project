package com.example.acer.navigation;

import android.support.v7.app.AppCompatActivity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;



public class Navigation extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    String[] android_versions = {
            "HOME",
            "PROFILE",
            "TASKS",
            "NOTIFICATIONS",
            "EMPLOYEES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        //ImageView myImageView = (ImageView) findViewById(R.id.profile_pic);
        //myImageView.setImageResource(R.drawable.fatima);
        listView = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android_versions);
        listView.setAdapter(adapter);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


    }
}
