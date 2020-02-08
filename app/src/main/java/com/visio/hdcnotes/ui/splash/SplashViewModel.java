package com.visio.hdcnotes.ui.splash;

import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.ui.base.BaseViewModel;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

public class SplashViewModel extends BaseViewModel<SplashNavigator> {
    public SplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider){
        super(dataManager, schedulerProvider);
    }
}
