package com.visio.hdcnotes.utils.rx;
//
// Created by ASLAM on 04-02-2020.
// Copyright (c) 2020 VisioApps Technology Pvt. Ltd. All rights reserved.
//

import io.reactivex.Scheduler;

public interface SchedulerProvider {
    Scheduler computation();
    Scheduler io();
    Scheduler ui();
}
