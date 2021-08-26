package com.example.springaopdemo.bean;

public class Person {
    private String name;
    private boolean sex;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isSex() {
        return sex;
    }

    public Person setSex(boolean sex) {
        this.sex = sex;
        return this;
    }
}
