package com.visio.hdcnotes.data.local.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.visio.hdcnotes.data.model.db.TaskList;

import java.util.List;

import io.reactivex.Single;

//
// Created by ASLAM on 04-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//
@Dao
public interface TaskListDao {
    @Delete
    void delete(TaskList taskList);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addTaskList(TaskList taskList);

    @Query("SELECT * FROM task_lists")
    Single<List<TaskList>> getAllTaskList();
}
