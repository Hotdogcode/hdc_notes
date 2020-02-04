package com.visio.hdcnotes.data.local.pref;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

public class AppPrefHelper implements PrefHelper{

    private static final String PREF_KEY_USERNAME = "PREF_KEY_USERNAME";
    private final SharedPreferences mSharedPref;

    @Inject
    public AppPrefHelper(Context context,String prefFileName){
        mSharedPref = context.getSharedPreferences(prefFileName,Context.MODE_PRIVATE);
    }

    @Override
    public String getCurrentUserName() {
        return mSharedPref.getString(PREF_KEY_USERNAME,null);
    }

    @Override
    public boolean setCurrentUserName(String userName) {
        mSharedPref.edit().putString(PREF_KEY_USERNAME,userName).apply();
        return true;
    }
}
