package com.project.app.services;

import com.project.app.models.Teacher;

public class TeacherService {
    public String approveStudent(Teacher teacher, String studentName, String course) {
        return teacher.approveStudent(studentName, course);
    }
}
