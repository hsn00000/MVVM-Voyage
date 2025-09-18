package com.example.mvvm_note.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NotesRepository {
    private final MutableLiveData<List<Note>> notes = new MutableLiveData<>(new ArrayList<>());

    @Inject
    public NotesRepository() {
        // Constructor for Hilt injection
        // Load initial data automatically
        load();
    }

    public LiveData<List<Note>> observeNotes() {
        return notes;
    }

    public void setAll(List<Note> list) {
        notes.setValue(new ArrayList<>(list));
    }

    public void add(Note note) {
        List<Note> current = new ArrayList<>(notes.getValue());
        current.add(0, note);
        notes.setValue(current);
    }


}