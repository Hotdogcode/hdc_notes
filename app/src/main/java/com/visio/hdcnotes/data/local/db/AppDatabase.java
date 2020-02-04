package com.visio.hdcnotes.data.local.db;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.visio.hdcnotes.data.local.db.dao.TaskDao;
import com.visio.hdcnotes.data.local.db.dao.TaskListDao;
import com.visio.hdcnotes.data.model.db.Task;
import com.visio.hdcnotes.data.model.db.TaskList;

@Database(entities = {Task.class, TaskList.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
    public abstract TaskListDao taskListDao();
}
