package com.visio.hdcnotes;
//
// Created by ASLAM on 14-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.ui.main.MainViewModel;
import com.visio.hdcnotes.ui.splash.SplashViewModel;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ViewModelProviderFactory extends ViewModelProvider.NewInstanceFactory {
    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;

    @Inject
    public ViewModelProviderFactory(DataManager dataManager, SchedulerProvider schedulerProvider){
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
       if(modelClass.isAssignableFrom(SplashViewModel.class)){
           return (T)new SplashViewModel(dataManager,schedulerProvider);
       }else if(modelClass.isAssignableFrom(MainViewModel.class)){
           return (T)new MainViewModel(dataManager,schedulerProvider);
       }
       throw new IllegalArgumentException("Unknown ViewModel Class "+ modelClass.getName());
    }
}
