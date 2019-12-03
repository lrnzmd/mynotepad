package com.example.mynotepad.ui;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mynotepad.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddNote() {
    return new ActionOnlyNavDirections(R.id.actionAddNote);
  }
}
