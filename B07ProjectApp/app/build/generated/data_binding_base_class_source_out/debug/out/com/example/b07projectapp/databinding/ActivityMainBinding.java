// Generated by view binder compiler. Do not edit!
package com.example.b07projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.b07projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button LogInAdminBtn;

  @NonNull
  public final Button LogInStudentBtn;

  @NonNull
  public final Button SignUpAdminBtn;

  @NonNull
  public final Button SignUpStudentBtn;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button4;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button LogInAdminBtn,
      @NonNull Button LogInStudentBtn, @NonNull Button SignUpAdminBtn,
      @NonNull Button SignUpStudentBtn, @NonNull Button button, @NonNull Button button4) {
    this.rootView = rootView;
    this.LogInAdminBtn = LogInAdminBtn;
    this.LogInStudentBtn = LogInStudentBtn;
    this.SignUpAdminBtn = SignUpAdminBtn;
    this.SignUpStudentBtn = SignUpStudentBtn;
    this.button = button;
    this.button4 = button4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LogInAdminBtn;
      Button LogInAdminBtn = ViewBindings.findChildViewById(rootView, id);
      if (LogInAdminBtn == null) {
        break missingId;
      }

      id = R.id.LogInStudentBtn;
      Button LogInStudentBtn = ViewBindings.findChildViewById(rootView, id);
      if (LogInStudentBtn == null) {
        break missingId;
      }

      id = R.id.SignUpAdminBtn;
      Button SignUpAdminBtn = ViewBindings.findChildViewById(rootView, id);
      if (SignUpAdminBtn == null) {
        break missingId;
      }

      id = R.id.SignUpStudentBtn;
      Button SignUpStudentBtn = ViewBindings.findChildViewById(rootView, id);
      if (SignUpStudentBtn == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, LogInAdminBtn, LogInStudentBtn,
          SignUpAdminBtn, SignUpStudentBtn, button, button4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}