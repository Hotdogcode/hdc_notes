package com.visio.hdcnotes.data.local.db;
//
// Created by ASLAM on 03-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import com.visio.hdcnotes.data.model.db.Task;
import com.visio.hdcnotes.data.model.db.TaskList;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

@Singleton
public class AppDatabseHelper implements DbHelper {

    private final AppDatabase appDatabase;

    @Inject
    public AppDatabseHelper(AppDatabase appDatabase){
        this.appDatabase = appDatabase;
    }

    @Override
    public Observable<Boolean> addTask(Task task) {
        return Observable.fromCallable(()->{
            appDatabase.taskDao().addTask(task);
            return true;
        });
    }

    @Override
    public Observable<Boolean> addTaskList(TaskList taskList) {
        return Observable.fromCallable(()->{
           appDatabase.taskListDao().addTaskList(taskList);
           return true;
        });
    }

    @Override
    public Observable<List<Task>> getAllTasks() {
        return appDatabase.taskDao().getAll().toObservable();
    }

    @Override
    public Observable<List<TaskList>> getAllTaskLists() {
        return appDatabase.taskListDao().getAllTaskList().toObservable();
    }

    @Override
    public Observable<Boolean> deleteTask(Task task) {
        return Observable.fromCallable(()->{
            appDatabase.taskDao().delete(task);
            return true;
        });
    }

    @Override
    public Observable<Boolean> deleteTaskList(TaskList taskList) {
        return Observable.fromCallable(()->{
            appDatabase.taskListDao().delete(taskList);
            return true;
        });
    }
}
