package com.myprojects.notetakingapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize // harus di tambahkan dari plugin

@Entity(tableName = "notes")
@Parcelize //ini maksudnya agar datanya bisa/transfer di bawa antar fragment/activity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val noteTitle:String,
    val noteBody:String
):Parcelable