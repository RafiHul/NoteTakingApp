package com.myprojects.notetakingapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.myprojects.notetakingapp.model.Note

@Dao
interface NoteDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(note: Note)

    @Update
    suspend fun updateNotes(note: Note)

    @Delete
    suspend fun deteletNotes(note: Note)

    @Query("SELECT * FROM notes ORDER BY Id DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("SELECT * FROM notes WHERE noteTitle LIKE:query OR noteBody LIKE:query")
    fun searchNotes(query:String?): LiveData<List<Note>>

}