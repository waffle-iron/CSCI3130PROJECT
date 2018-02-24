package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddDropActivity extends AppCompatActivity {
    private TextView ClassInformation;
    private Button AddClassBtn;
    private Button DropClassBtn;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drop);

        ClassInformation=findViewById(R.id.currentCourse);
        AddClassBtn=findViewById(R.id.AddClassbtn);
        DropClassBtn=findViewById(R.id.DropClassBtn);

        // firebase
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("");


    }


    @Override
    protected void onStart() {
        super.onStart();

        // read data from firebase





    }
}
