package com.myprojects.notetakingapp.repository

import com.myprojects.notetakingapp.database.NoteDatabase
import com.myprojects.notetakingapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNotes(note:Note) = db.getNoteDao().insertNotes(note)
    suspend fun deleteNotes(note:Note) = db.getNoteDao().deteletNotes(note)
    suspend fun updateNotes(note: Note) = db.getNoteDao().updateNotes(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun getSearchNotes(query:String?) = db.getNoteDao().searchNotes(query)
}