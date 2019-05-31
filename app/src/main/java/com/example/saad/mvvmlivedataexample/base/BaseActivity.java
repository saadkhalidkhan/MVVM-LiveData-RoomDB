package com.example.saad.mvvmlivedataexample.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T extends ViewDataBinding, V extends BaseViewModel> extends AppCompatActivity implements BaseFragment.Callback {

    private T mViewDataBinding;
    private V mViewModel;

    @LayoutRes
    public abstract int getLayout();

    public abstract V getViewModel();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDataBinding();
    }

    private void performDataBinding() {

        mViewDataBinding = DataBindingUtil.setContentView(this, getLayout());
        this.mViewModel = mViewModel == null ? getViewModel() : mViewModel;
    }

    public T getViewDataBinding() {
        return mViewDataBinding;
    }

    @Override
    public void onFragmentAttached() {

    }

    @Override
    public void onFragmentDetached(String tag) {

    }
}
