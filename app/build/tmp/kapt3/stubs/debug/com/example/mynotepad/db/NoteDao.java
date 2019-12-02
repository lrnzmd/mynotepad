package com.example.mynotepad.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mynotepad/db/NoteDao;", "", "addMultipleNotes", "", "note", "", "Lcom/example/mynotepad/db/Note;", "([Lcom/example/mynotepad/db/Note;)V", "addnote", "getallnotes", "", "app_debug"})
public abstract interface NoteDao {
    
    @androidx.room.Insert()
    public abstract void addnote(@org.jetbrains.annotations.NotNull()
    com.example.mynotepad.db.Note note);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM note")
    public abstract java.util.List<com.example.mynotepad.db.Note> getallnotes();
    
    @androidx.room.Insert()
    public abstract void addMultipleNotes(@org.jetbrains.annotations.NotNull()
    com.example.mynotepad.db.Note... note);
}