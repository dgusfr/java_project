package com.project.app.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUtil {
    public static String formatJSONObject(JSONObject jsonObject) {
        return jsonObject.toString(4);
    }

    public static JSONArray parseJSONArray(String jsonString) {
        return new JSONArray(jsonString);
    }
}
