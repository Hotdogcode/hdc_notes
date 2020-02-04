package com.visio.hdcnotes.data.local.db;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//


import com.visio.hdcnotes.data.model.db.Task;
import com.visio.hdcnotes.data.model.db.TaskList;

import java.util.List;

import io.reactivex.Observable;

public interface DbHelper {
    Observable<Boolean> addTask(final Task task);
    Observable<Boolean> addTaskList(final TaskList taskList);
    Observable<List<Task>> getAllTasks();
    Observable<List<TaskList>> getAllTaskLists();
    Observable<Boolean> deleteTask(final Task task);
    Observable<Boolean> deleteTaskList(final TaskList taskList);
}
