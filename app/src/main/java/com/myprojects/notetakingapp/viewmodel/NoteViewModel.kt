package com.myprojects.notetakingapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.myprojects.notetakingapp.model.Note
import com.myprojects.notetakingapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(private val app:Application,
                    private val noteRepository: NoteRepository
):AndroidViewModel(app) {

    fun insertNote(note: Note) = viewModelScope.launch {
        noteRepository.insertNotes(note)
    }

    fun deleteNote(note:Note) = viewModelScope.launch {
        noteRepository.deleteNotes(note)
    }

    fun updateNote(note:Note) = viewModelScope.launch {
        noteRepository.updateNotes(note)
    }

    fun getAllNote() = noteRepository.getAllNotes()

    fun searchNote(query:String?) = noteRepository.getSearchNotes(query)


}