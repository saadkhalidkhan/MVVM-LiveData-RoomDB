package com.example.saad.mvvmlivedataexample.view.activities.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

import com.example.saad.mvvmlivedataexample.data.local.model.Note;
import com.example.saad.mvvmlivedataexample.repository.NoteRepository;

import java.util.List;

public class MainViewModel extends ViewModel {

    private NoteRepository repository;
    private LiveData<List<Note>> allNotes;

//    public MainViewModel(NoteRepository repository) {
//        super(repository);
//
//        allNotes = getRepository().getAllNotes();
//    }

    public MainViewModel() {

    }

    public void initData(Context context) {
        repository = new NoteRepository(context);
        allNotes = repository.getAllNotes();
    }

    public void insert(Note note) {
        repository.insert(note);
    }

    public void update(Note note) {
        repository.update(note);
    }

    public void delete(Note note) {
        repository.delete(note);
    }

    public void deleteAllNotes() {
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() {
        return allNotes;
    }
}
