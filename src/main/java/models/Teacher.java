package com.project.app.models;

public class Teacher extends User {
    public Teacher(String name, String email) {
        super(name, email);
    }

    public String approveStudent(String studentName, String course) {
        return "Student " + studentName + " approved for course " + course + ".";
    }
}
