package com.example.mynotepad.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotepad.db.Note

class NoteAdapter(val notes: List<Note>): RecyclerView.Adapter<>() {

    class NoteViewHolder (val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) NoteViewHolder  {
    return NoteViewHolder(
        LayoutInflater.from()
    )
}

    override fun getItemCount():Int{
    }
    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: NoteAdapter.NoteViewHolder, position: Int){

    }

    class  NoteViewHorder(val view: View)RecyclerView(view)
}