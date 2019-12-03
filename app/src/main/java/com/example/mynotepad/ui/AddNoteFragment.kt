package com.example.mynotepad.ui


import android.os.AsyncTask
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mynotepad.R
import com.example.mynotepad.db.Note
import com.example.mynotepad.db.NoteDatabase
import kotlinx.android.synthetic.main.fragment_add_note.*
import kotlinx.coroutines.launch

/**
 * A simple [Fragment] subclass.
 */
class AddNoteFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_note, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       button_save.setOnClickListener {
           val noteTitle = edit_text_title.text.toString().trim()
           val noteBody = edit_text_note.text.toString().trim()


           if (noteTitle.isEmpty()){
               edit_text_title.error="this requied"
               edit_text_title.requestFocus()
               return@setOnClickListener
           }

           if (noteTitle.isEmpty()){
               edit_text_note.error="this requied"
               edit_text_note.requestFocus()
               return@setOnClickListener
           }


           launch {
               val note = Note(noteBody, noteTitle)

               context?.let {
                   NoteDatabase(it).getNoteDao().addnote(note)
               it.toast("note save")}
           }

        //   saveNote(note)

       }
    }

//    private fun saveNote(note: Note){
//        class SaveNote : AsyncTask<Void, Void, Void>(){
//            override fun doInBackground(vararg params: Void?): Void? {
//                NoteDatabase(activity!!).getNoteDao().addnote(note)
//                return null
//            }
//
//            override fun onPostExecute(result: Void?) {
//                super.onPostExecute(result)
//
//                Toast.makeText(activity, "note saved", Toast.LENGTH_LONG).show()
//            }
//        }
//        SaveNote().execute()
//    }
//
}
