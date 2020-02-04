package com.visio.hdcnotes.data;
//
// Created by ASLAM on 04-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import android.content.Context;

import com.google.gson.Gson;
import com.visio.hdcnotes.data.local.db.AppDatabase;
import com.visio.hdcnotes.data.local.db.DbHelper;
import com.visio.hdcnotes.data.local.pref.PrefHelper;
import com.visio.hdcnotes.data.model.db.Task;
import com.visio.hdcnotes.data.model.db.TaskList;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

@Singleton
public class AppDataManager implements DataManager{
    private final static String TAG = "AppDataManager";
    private final Context context;
    private final DbHelper dbHelper;
    private final PrefHelper prefHelper;
    private final Gson gson;

    @Inject
    public AppDataManager(Context context,DbHelper dbHelper,Gson gson,PrefHelper prefHelper){
        this.context = context;
        this.dbHelper = dbHelper;
        this.gson = gson;
        this.prefHelper = prefHelper;
    }

    @Override
    public Observable<Boolean> addTask(Task task) {
        return dbHelper.addTask(task);
    }

    @Override
    public Observable<Boolean> addTaskList(TaskList taskList) {
        return dbHelper.addTaskList(taskList);
    }

    @Override
    public Observable<List<Task>> getAllTasks() {
        return dbHelper.getAllTasks();
    }

    @Override
    public Observable<List<TaskList>> getAllTaskLists() {
        return dbHelper.getAllTaskLists();
    }

    @Override
    public Observable<Boolean> deleteTask(Task task) {
        return dbHelper.deleteTask(task);
    }

    @Override
    public Observable<Boolean> deleteTaskList(TaskList taskList) {
        return dbHelper.deleteTaskList(taskList);
    }

    @Override
    public String getCurrentUserName() {
        return prefHelper.getCurrentUserName();
    }

    @Override
    public boolean setCurrentUserName(String userName) {
        return prefHelper.setCurrentUserName(userName);
    }
}
