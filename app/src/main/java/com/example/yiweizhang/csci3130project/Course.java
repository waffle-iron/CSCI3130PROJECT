package com.example.yiweizhang.csci3130project;

/**
 * Created by chenenlin on 18/2/24.
 */

public class Course {
        String name;
        String location;
        int section;
        String day;
        int time;
        int courseHour;
        int courseId;
        String instructor;

        public Course(String name, String location,int section,String day,int time,int courseHour,int courseId,String instructor){
            this.name = name;
            this.location = location;
            this.section = section;
            this.day = day;
            this.time = time;
            this.courseHour = courseHour;
            this.courseId = courseId;
            this.instructor = instructor;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getSection() {
            return section;
        }

        public void setSection(int section) {
            this.section = section;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getCourseHour() {
            return courseHour;
        }

        public void setCourseHour(int courseHour) {
            this.courseHour = courseHour;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getInstructor() {
            return instructor;
        }

        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString(){

        return  "\nThe Course Name is "+ getName() + "\n" +
                "\nThe location of the class is "+ getLocation() +"\n"+
                "\nThe course hour is "+ getCourseHour() +"\n"+
                "\nCourse Id "+ getCourseId() +"\n"+
                "\nThe day of the class "+ getDay() +"\n"+
                "\nThe instructor is "+ getInstructor() +"\n"+
                "\nSection Number is "+ getSection() +"\n"+
                "\nThe time of the class is "+ getTime() +"\n";

    }
    }


