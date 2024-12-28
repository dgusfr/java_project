package com.project.app.services;

import com.project.app.models.User;

public class UserService {
    public void updateEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    public boolean validateEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
