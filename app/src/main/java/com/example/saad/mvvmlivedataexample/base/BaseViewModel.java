package com.example.saad.mvvmlivedataexample.base;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

import com.example.saad.mvvmlivedataexample.repository.NoteRepository;

import java.lang.ref.WeakReference;

public abstract class BaseViewModel<N> extends ViewModel {

    private final NoteRepository repository;

    private WeakReference<N> mNavigator;

    protected BaseViewModel(Context context) {

        this.repository = new NoteRepository(context);
    }

    public NoteRepository getRepository() {
        return repository;
    }

    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }

    public N getNavigator() {
        return mNavigator.get();
    }
}
