package com.project.app.services;

import com.project.app.models.Admin;

public class AdminService {
    public String createCourse(Admin admin, String courseName, int slots) {
        return admin.createCourse(courseName, slots);
    }
}
