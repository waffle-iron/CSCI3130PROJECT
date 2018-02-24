package com.example.yiweizhang.csci3130project;

/**
 * Created by chenenlin on 18/2/24.
 */
import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;

public class CourseList {

    public static void main(String[] args ){

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

    }
}