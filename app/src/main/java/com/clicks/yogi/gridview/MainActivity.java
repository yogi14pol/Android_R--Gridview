package com.clicks.yogi.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView mylist;
    String[] ipl = {"CSK", "KKR", "RCB", "DC", "MI", "RR", "KXI-PUNJAB", "SH", "DD","CSK", "KKR", "RCB", "DC", "MI", "RR", "KXI-PUNJAB", "SH", "DD"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = findViewById(R.id.grid);

        arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, ipl);
        mylist.setAdapter(arrayAdapter);

    }
}