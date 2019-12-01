package com.example.mynotepad.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mynotepad.R;

public class AddNoteFragmentDirections {
  private AddNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections ActionSaveNote() {
    return new ActionOnlyNavDirections(R.id.ActionSaveNote);
  }
}
