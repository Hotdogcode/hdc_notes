package com.visio.hdcnotes.ui.main;
//
// Created by ASLAM on 14-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.visio.hdcnotes.BR;
import com.visio.hdcnotes.R;
import com.visio.hdcnotes.ViewModelProviderFactory;
import com.visio.hdcnotes.databinding.ActivityMainBinding;
import com.visio.hdcnotes.ui.base.BaseActivity;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainViewModel> implements MainNavigator {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;



    private ActivityMainBinding mainBinding;
    private DrawerLayout drawerLayout;
    @Inject
    MainViewModel mainViewModel;
    private Toolbar toolbar;


    @Override
    public int getBindingVariable() {
        return com.visio.hdcnotes.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        return mainViewModel;

    }

    @Override
    public void handleError(Throwable throwable) {

    }
}
