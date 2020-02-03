package com.visio.hdcnotes.utils;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.room.TypeConverter;

import java.util.Date;

public class Converters {
    @TypeConverter
    public static Date dateFromLong(Long value){
        return value == null ? null : new Date(value);
    }
    @TypeConverter
    public static Long longFromDate(Date date){
        return date==null ? null : date.getTime();
    }
}
