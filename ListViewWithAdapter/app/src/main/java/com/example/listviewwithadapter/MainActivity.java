package com.example.listviewwithadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String []arr= {"sanjay","sanjay1","sanjay2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter ad = new MyAdapter(this,R.layout.my_list_view,arr);
        l = findViewById(R.id.listView);
        l.setAdapter(ad);
    }
}