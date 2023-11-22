package com.example.b07projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudentDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);
    }

    public void onClickStudentComplaint(View view) {
        Intent intent = new Intent(getApplicationContext(), StudentComplaint.class);
        startActivity(intent);
    }
    public void onClickStudentEvent(View view) {
        Intent intent = new Intent(getApplicationContext(), StudentEvents.class);
        startActivity(intent);
    }
}