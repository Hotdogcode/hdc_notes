package com.visio.hdcnotes.di.builder;

import com.visio.hdcnotes.ui.main.MainActivity;
import com.visio.hdcnotes.ui.main.MainActivityModule;
import com.visio.hdcnotes.ui.splash.SplashActivity;
import com.visio.hdcnotes.ui.splash.SplashActvityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SplashActvityModule.class)
    abstract SplashActivity bindSplashActivity();

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();
}
