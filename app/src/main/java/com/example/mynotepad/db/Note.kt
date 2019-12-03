package com.example.mynotepad.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(val id: Int, val noteBody: String, val noteTitle: String) {

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "note_title")
    val title: String,
    @ColumnInfo(name = "note_text")
    val note: String,

}


