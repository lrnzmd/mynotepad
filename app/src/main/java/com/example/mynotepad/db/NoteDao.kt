package com.example.mynotepad.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface NoteDao {
    @Insert
    suspend fun addnote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getallnotes() : List<Note>

    @Insert
    suspend fun addMultipleNotes(vararg note: Note)
}