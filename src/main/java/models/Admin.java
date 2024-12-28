package com.project.app.models;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public String createCourse(String courseName, int slots) {
        return "Course \"" + courseName + "\" created with " + slots + " slots.";
    }
}
