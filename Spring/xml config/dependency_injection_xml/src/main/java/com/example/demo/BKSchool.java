package com.example.demo;

public class BKSchool implements School {
    String name;
    @Override
    public String getSchoolInfo() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
