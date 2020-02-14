package com.visio.hdcnotes.ui.main;
//
// Created by ASLAM on 14-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.visio.hdcnotes.ViewModelProviderFactory;
import com.visio.hdcnotes.databinding.ActivityMainBinding;
import com.visio.hdcnotes.ui.base.BaseActivity;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;

public class MainActivity extends BaseActivity<ActivityMainBinding,MainViewModel> implements MainNavigator {

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;
    @Inject
    ViewModelProviderFactory factory;




}
