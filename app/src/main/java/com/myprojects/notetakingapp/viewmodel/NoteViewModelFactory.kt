package com.myprojects.notetakingapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.myprojects.notetakingapp.repository.NoteRepository

class NoteViewModelFactory(val app:Application,private val repository: NoteRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NoteViewModel::class.java)){
            return NoteViewModel(app,repository) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}