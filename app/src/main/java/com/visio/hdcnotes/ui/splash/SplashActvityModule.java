package com.visio.hdcnotes.ui.splash;

import com.visio.hdcnotes.data.DataManager;
import com.visio.hdcnotes.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

@Module
public class SplashActvityModule {
    @Provides
    SplashViewModel provideSplashViewModel(DataManager dataManager, SchedulerProvider schedulerProvider){
        return new SplashViewModel(dataManager,schedulerProvider);
    }
}
