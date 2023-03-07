package com.example.demo;

public class USTHSchool implements School {
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
