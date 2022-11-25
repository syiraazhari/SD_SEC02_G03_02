package com.example.loginapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SubjectRegistration extends AppCompatActivity {

    Spinner spinner;
    DatabaseReference dbref;
    Button btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_registration);

        spinner = (Spinner)findViewById(R.id.spinnerdata);
        dbref = FirebaseDatabase.getInstance().getReference("spinnerdata");
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}