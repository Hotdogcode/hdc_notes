package com.visio.hdcnotes.ui.base;
//
// Created by ASLAM on 04-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;
import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel<N> extends ViewModel {
    private final DataManager dataManager;
    private final ObservableBoolean isLoading = new ObservableBoolean();
    private final SchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private N navigator;

    public BaseViewModel(DataManager dataManager,SchedulerProvider schedulerProvider){
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    protected void onCleared() {
        compositeDisposable.clear();
        super.onCleared();
    }
    public CompositeDisposable getCompositeDisposable(){
        return compositeDisposable;
    }
    public DataManager getDataManager(){
        return dataManager;
    }
    public SchedulerProvider getSchedulerProvider(){
        return schedulerProvider;
    }
    public N getNavigator(){
        return navigator;
    }
    public void setNavigator(N navigator){
        this.navigator = navigator;
    }
    public ObservableBoolean getIsLoading(){
        return isLoading;
    }
    public void setIsLoading(Boolean isLoading){
       this.isLoading.set(isLoading);
    }
}
