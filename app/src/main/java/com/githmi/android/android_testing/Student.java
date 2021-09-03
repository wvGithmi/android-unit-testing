package com.githmi.android.android_testing;

public class Student {
    public int id;
    public String name;
    public int age;

    public String stu_details(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

        return id + name + age;
    }
}