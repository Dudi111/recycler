package com.example.recycler;

public class Student {
    private String name;
    private int age;
    private String roll;

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age, String roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

}
