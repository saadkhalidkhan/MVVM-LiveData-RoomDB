package com.example.saad.mvvmlivedataexample.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity implements BaseFragment.Callback {

    private T mViewDataBinding;

    @LayoutRes
    public abstract int getLayout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        performDataBinding();
    }

    private void performDataBinding() {

        mViewDataBinding = DataBindingUtil.setContentView(this, getLayout());
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
