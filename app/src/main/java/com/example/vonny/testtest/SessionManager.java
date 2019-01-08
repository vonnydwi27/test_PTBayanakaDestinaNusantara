package com.example.vonny.testtest;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;

    public static final String KEY_TOKEN = "token";
    private static final String PREF_NAME = "AndroidHivePref";

    public SessionManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    public String getToken(){
        return pref.getString(KEY_TOKEN,"");
    }
}
