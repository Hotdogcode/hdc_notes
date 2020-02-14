package com.visio.hdcnotes.ui.main;
//
// Created by ASLAM on 14-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.databinding.ObservableField;

import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.ui.base.BaseViewModel;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

public class MainViewModel extends BaseViewModel<MainNavigator> {
    private static final String TAG = "MAIN VIEW MODEL";
    private final ObservableField<String> appVersion = new ObservableField<>();
    public MainViewModel(DataManager dataManager, SchedulerProvider schedulerProvider){
        super(dataManager, schedulerProvider);
    }

}
