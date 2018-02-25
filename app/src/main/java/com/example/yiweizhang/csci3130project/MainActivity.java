package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));

        listView = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Course));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Course", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapter);

    }
}
