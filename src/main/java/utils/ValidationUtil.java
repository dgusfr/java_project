package com.project.app.utils;

public class ValidationUtil {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
