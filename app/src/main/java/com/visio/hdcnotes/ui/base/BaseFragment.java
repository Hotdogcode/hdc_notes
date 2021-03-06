package com.visio.hdcnotes.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

public abstract class BaseFragment<T extends ViewDataBinding, V extends BaseViewModel> extends Fragment {
    private BaseActivity baseActivity;
    private T mViewDataBinding;
    private V mViewModel;
    private View mRootView;


    public abstract int getBindingVariable();

    public abstract @LayoutRes int getLayoutId();

    public abstract V getViewModel();

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof BaseActivity){
            BaseActivity baseActivity = (BaseActivity)context;
            this.baseActivity = baseActivity;
            baseActivity.onFragmentAttached();
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        performDependencyInjection();
        super.onCreate(savedInstanceState);
        mViewModel = getViewModel();
        setHasOptionsMenu(false);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mViewDataBinding = DataBindingUtil.inflate(inflater,getLayoutId(),container,false);
        mRootView = mViewDataBinding.getRoot();
        return mRootView;
    }

    @Override
    public void onDetach() {
        baseActivity = null;
        super.onDetach();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewDataBinding.setVariable(getBindingVariable(),mViewModel);
        mViewDataBinding.executePendingBindings();
    }

    public BaseActivity getBaseActivity(){
        return baseActivity;
    }

    public T getViewDataBinding(){
        return mViewDataBinding;
    }

    public void hideKeyboard(){
        if(baseActivity!=null)
            baseActivity.hideKeyboard();
    }

    public boolean isNetwordConnected(){
        return baseActivity!=null && baseActivity.isNetworkConnected();
    }

    public void performDependencyInjection(){
        AndroidSupportInjection.inject(this);
    }

    public interface callback{
        void onFragmentAttached();
        void onFragmentDetached(String tag);
    }
}
