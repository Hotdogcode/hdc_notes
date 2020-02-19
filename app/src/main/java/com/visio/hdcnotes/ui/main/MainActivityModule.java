package com.visio.hdcnotes.ui.main;
//
// Created by ASLAM on 14-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.lifecycle.ViewModelProvider;

import com.visio.hdcnotes.ViewModelProviderFactory;
import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {


    @Provides
    MainViewModel provideMainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider){
        return new ViewModelProviderFactory(dataManager, schedulerProvider).create(MainViewModel.class);
    }
}
