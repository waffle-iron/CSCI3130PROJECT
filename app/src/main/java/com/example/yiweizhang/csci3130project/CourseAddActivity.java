package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CourseAddActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference Instructor;

    private Button submit;
    private EditText id;
    private EditText number;
    private EditText location;
    private EditText Time;
    private EditText Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courseadd);

        database = FirebaseDatabase.getInstance();
        Instructor = database.getReference("Course");

        submit = (Button)findViewById(R.id.Submit);
        id = (EditText) findViewById(R.id.CourseID);
        number = (EditText) findViewById(R.id.Capacity);
        location = (EditText) findViewById(R.id.Location);
        Time = (EditText) findViewById(R.id.Time);
        Date = (EditText) findViewById(R.id.Date);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Vid = id.getText().toString();
                String Vnumber = number.getText().toString();
                String Vlocation = location.getText().toString();
                String Vtime = Time.getText().toString();
                String Vdate = Date.getText().toString();
                if (TextUtils.isEmpty(Vid)){
                    id.setError("Required");
                    return;
                }
                if (TextUtils.isEmpty(Vnumber)){
                    number.setError("Required");
                    return;
                }

                if (TextUtils.isEmpty(Vlocation)){
                    location.setError("Required");
                    return;
                }
                if (TextUtils.isEmpty(Vtime)){
                    Time.setError("Required");
                    return;
                }
                if (TextUtils.isEmpty(Vdate)){
                    Date.setError("Required");
                    return;
                }
                DatabaseReference myid = Instructor.child("CourseID");

                DatabaseReference mynumber = Instructor.child("Capacity");

                DatabaseReference mylocation = Instructor.child("Location");

                DatabaseReference mytime = Instructor.child("Time");

                DatabaseReference mydate = Instructor.child("Date");

                myid.setValue(Vid);
                mynumber.setValue(Vnumber);
                mylocation.setValue(Vlocation);
                mytime.setValue(Vtime);
                mydate.setValue(Vdate);
                Toast.makeText(getApplicationContext(), "Course Added", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
