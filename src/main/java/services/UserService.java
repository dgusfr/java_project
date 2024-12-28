package com.project.app.services;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.project.app.models.User;

public class UserService {
    public List<User> loadUsersFromJSON(String filePath) {
        List<User> users = new ArrayList<>();
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath))); // Lê o conteúdo do arquivo JSON
            JSONArray jsonArray = new JSONArray(content); // Converte o conteúdo para um JSONArray
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                users.add(new User(obj.getString("name"), obj.getString("email"))); // Cria um User e adiciona à lista
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
