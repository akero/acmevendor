package com.acme.campaignproject.utility;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferences {

    private static final String PLACE_OBJ = "place_obj"; // This was defined but never used in the original Kotlin code
    private static final String USER_DATA = "user_data";

    private static final AppPreferences INSTANCE = new AppPreferences();
    private static SharedPreferences sharedPreferences;

    private AppPreferences() {
    }

    public static AppPreferences getInstance(Context context) {
        if (sharedPreferences == null) {
            synchronized (AppPreferences.class) {
                if (sharedPreferences == null) {
                    sharedPreferences = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
                }
            }
        }
        return INSTANCE;
    }

    public String getUserData() {
        return sharedPreferences.getString(USER_DATA, "");
    }

    public void saveUserData(String userDataStr) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USER_DATA, userDataStr);
        editor.apply();
    }

    public void removeUserData() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(USER_DATA);
        editor.apply();
    }

    public void clearAll() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}
