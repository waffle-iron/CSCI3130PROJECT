package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddDropActivity extends AppCompatActivity {
    private TextView ClassInformation;
    private Button AddClassBtn;
    private Button DropClassBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drop);

        ClassInformation=findViewById(R.id.textView);
        AddClassBtn=findViewById(R.id.AddClassbtn);
        DropClassBtn=findViewById(R.id.DropClassBtn);



    }
}
