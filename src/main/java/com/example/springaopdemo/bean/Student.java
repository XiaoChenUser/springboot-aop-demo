package com.example.springaopdemo.bean;

public class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public Student setSchool(String school) {
        this.school = school;
        return this;
    }
}
