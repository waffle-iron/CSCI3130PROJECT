package com.example.yiweizhang.csci3130project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.*;

public class SecondActivity extends AppCompatActivity {

    ArrayList <Course>  Courselist = new ArrayList<Course>(20);

    Course c0 = new Course("Database Design","Halifax",01,"Wed Fri",1130,3,134256,"James Hook");
    Course c1 = new Course("Ensemble","Halifax",01,"Wed Fri",1130,3,73456,"Baby Fiber");
    Course c2 = new Course("Ensemble 1","Truro",01,"Wed Fri",1230,3,53456,"Alan Raddies");
    Course c3 = new Course("Voice","Halifax",01,"Wed Fri",1330,3,76456,"Ruddy Beck");
    Course c4 = new Course("Guitar","Vancouver",01,"Wed Fri",1430,3,56456,"Rose Mary");
    Course c5 = new Course("Piano","Halifax",01,"Wed Fri",1530,6,13986,"Hellen kelly");
    Course c6 = new Course("violin","Montreal",02,"Wed Fri",1630,6,13226,"James Mac");
    Course c7 = new Course("French","Halifax",01,"Wed Fri",1730,6,13466,"James Groody");
    Course c8 = new Course("Spanish","Quebec",03,"Wed Fri",1030,3,16764,"Beckham Billy");
    Course c9 = new Course("Chinese","Halifax",01,"Wed Fri",930,6,12312,"Eddison Chen");
    Course c10 = new Course("Japanese","Halifax",01,"Wed Fri",1030,6,137676,"Raffle Don");
    Course c11 = new Course("German Fiction","Halifax",01,"Wed Fri",2030,6,18756,"James Junk");
    Course c12 = new Course("Halifax and the world","Halifax",01,"Wed Fri",1130,3,87456,"Junk Taylor");
    Course c13 = new Course("Introduction to Java","Halifax",02,"Wed Fri",1230,3,15646,"James Junk");
    Course c14 = new Course("Introduction to C","Halifax",01,"Wed Fri",1530,3,13236,"Mallon Beck");
    Course c15 = new Course("Introduction to python","Halifax",01,"Wed Fri",1730,3,11256,"Oemandh Djamca");
    Course c16 = new Course("Introduction to C++","Halifax",04,"Wed Fri",1730,3,18456,"James Hip");
    Course c17 = new Course("Introduction to UI","Halifax",02,"Wed Fri",1830,3,134556,"James Brooklyn");
    Course c18 = new Course("Math 2112","Halifax",01,"Wed Fri",1130,3,13246,"James Mary");
    Course c19 = new Course("Math 2001","Halifax",03,"Wed Fri",1130,3,13786,"Mary Killy");

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Courselist.add(c0);
        Courselist.add(c1);
        Courselist.add(c2);
        Courselist.add(c3);
        Courselist.add(c4);
        Courselist.add(c5);
        Courselist.add(c6);
        Courselist.add(c7);
        Courselist.add(c8);
        Courselist.add(c9);
        Courselist.add(c10);
        Courselist.add(c11);
        Courselist.add(c12);
        Courselist.add(c13);
        Courselist.add(c14);
        Courselist.add(c15);
        Courselist.add(c16);
        Courselist.add(c17);
        Courselist.add(c18);
        Courselist.add(c19);


        textView = (TextView)findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            if(bundle.getString("Course").equalsIgnoreCase("Database Design")){
                textView.setText(Courselist.get(0).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Ensemble")){
                textView.setText(Courselist.get(1).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Ensemble 1")){
                textView.setText(Courselist.get(2).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Voice")){
                textView.setText(Courselist.get(3).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Guitar")){
                textView.setText(Courselist.get(4).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Piano")){
                textView.setText(Courselist.get(5).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("violin")){
                textView.setText(Courselist.get(6).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("French")){
                textView.setText(Courselist.get(7).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Spanish")){
                textView.setText(Courselist.get(8).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Chinese")){
                textView.setText(Courselist.get(9).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Japanese")){
                textView.setText(Courselist.get(10).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("German Fiction")){
                textView.setText(Courselist.get(11).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Halifax and the world")){
                textView.setText(Courselist.get(12).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Introduction to Java")){
                textView.setText(Courselist.get(13).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Introduction to C")){
                textView.setText(Courselist.get(14).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Introduction to python")){
                textView.setText(Courselist.get(15).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Introduction to C++")){
                textView.setText(Courselist.get(16).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Introduction to UI")){
                textView.setText(Courselist.get(17).toString());
            }
            if(bundle.getString("Course").equalsIgnoreCase("Math 2112")){
                textView.setText(Courselist.get(18).toString());

            }if(bundle.getString("Course").equalsIgnoreCase("Math 2001")){
                textView.setText(Courselist.get(19).toString());
            }

        }


    }
}