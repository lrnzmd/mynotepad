package com.example.mynotepad.db;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\u0000H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mynotepad/db/Note;", "", "()V", "note", "", "getNote", "()Ljava/lang/String;", "title", "getTitle", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Note {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "note_title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "note_text")
    private final java.lang.String note = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public Note() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mynotepad.db.Note copy() {
        return null;
    }
}