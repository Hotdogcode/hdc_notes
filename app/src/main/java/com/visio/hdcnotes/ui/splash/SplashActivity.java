package com.visio.hdcnotes.ui.splash;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.visio.hdcnotes.BR;
import com.visio.hdcnotes.R;
import com.visio.hdcnotes.databinding.ActivitySplashBinding;
import com.visio.hdcnotes.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity<ActivitySplashBinding,SplashViewModel> implements SplashNavigator {
    @Inject
    SplashViewModel splashViewModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public SplashViewModel getViewModel() {
        return splashViewModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashViewModel.setNavigator(this);
    }

    @Override
    public void openHomeActivity() {

    }
}
