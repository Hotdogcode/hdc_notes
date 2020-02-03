package com.visio.hdcnotes.data.model.db;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "task_lists")
public class TaskList {
    @Expose
    @PrimaryKey
    public Long id;

    @Expose
    @SerializedName("title")
    @ColumnInfo(name = "title")
    public String title;

    @Expose
    @SerializedName("created_at")
    @ColumnInfo(name="created_at")
    public String createdAt;

    @Expose
    @SerializedName("is_completed")
    @ColumnInfo(name="is_completed")
    public boolean isCompleted;

    @Expose
    @SerializedName("theme_id")
    @ColumnInfo(name = "theme_id")
    public int themeId;

}
