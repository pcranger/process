package com.example.demo;

public class Student {
    private School school;

    public Student() {
    }

    public Student(School school) {
        this.school = school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void printSchoolInfo(){
        System.out.println( school.getSchoolInfo());
    }
}
