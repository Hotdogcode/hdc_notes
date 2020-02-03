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

import java.util.Date;

@Entity(tableName = "tasks")
public class Task {
    @Expose
    @PrimaryKey
    public Long id;

    @Expose
    @SerializedName("title")
    @ColumnInfo(name = "title")
    public String title;

    @Expose
    @SerializedName("is_imp")
    @ColumnInfo(name="is_imp")
    public boolean isImp;

    @Expose
    @SerializedName("list_id")
    @ColumnInfo(name = "list_id")
    public Long listId;

    @Expose
    @SerializedName("reminder_at")
    @ColumnInfo(name="reminder_at")
    public Date reminderAt;

    @Expose
    @SerializedName("is_repeat")
    @ColumnInfo(name="is_repeat")
    public boolean isRepeat;

    @Expose
    @SerializedName("note")
    @ColumnInfo(name = "note")
    public String note;

    @Expose
    @SerializedName("file")
    @ColumnInfo(name="file")
    public String file;

    @Expose
    @SerializedName("created_at")
    @ColumnInfo(name = "created_at")
    public Date createdAt;

    @Expose
    @SerializedName("is_completed")
    @ColumnInfo(name="is_completed")
    public boolean isCompleted;

}
