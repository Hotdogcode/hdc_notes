package com.visio.hdcnotes.data.local.db.dao;
//
// Created by ASLAM on 04-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.visio.hdcnotes.data.model.db.Task;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface TaskDao {
    @Delete
    void delete(Task task);

    @Query("SELECT * FROM tasks")
    Single<List<Task>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addTask(Task task);


}
