package com.visio.hdcnotes.ui.base;

import android.content.Context;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import dagger.android.AndroidInjection;

public abstract class BaseActivity<T extends ViewDataBinding, V extends BaseViewModel> extends AppCompatActivity
    implements BaseFragment.callback
{
    private T mViewDataBinding;
    private V mViewModel;

    public abstract int getBindingVariable();

    public abstract  @LayoutRes int getLayoutId();

    public abstract V getViewModel();

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        performDependencyInjection();
        super.onCreate(savedInstanceState);
        performDataBinding();
    }

    public T getViewDataBinding(){
        return mViewDataBinding;
    }

    public void hideKeyboard(){
        View view = this.getCurrentFocus();
        if(view!=null){
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            if(imm!=null){
                imm.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        }
    }

    public void hideLoading(){

    }

    public boolean isNetworkConnected(){
        return true;
    }

    public void restartLoginAfterTokenExpires(){

    }

    public void performDependencyInjection(){
        AndroidInjection.inject(this);
    }

    private void performDataBinding(){
        mViewDataBinding = DataBindingUtil.setContentView(this,getLayoutId());
        this.mViewModel = mViewModel==null?getViewModel():mViewModel;
        mViewDataBinding.setVariable(getBindingVariable(),mViewModel);
        mViewDataBinding.executePendingBindings();
    }

}
