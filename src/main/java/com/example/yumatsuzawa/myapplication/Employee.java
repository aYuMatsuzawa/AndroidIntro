package com.example.yumatsuzawa.myapplication;

/**
 * Created by yumatsuzawa on 15/04/24.
 */
public class Employee {

    private final String name;
    private final String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public String toString() {
        return this.name;
    }

}
