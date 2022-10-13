package com.example.loginapps.Lecturer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginapps.ComputerScienceInfo;
import com.example.loginapps.R;
import com.example.loginapps.Student.ComputerScienceTable;
import com.example.loginapps.Student.TimeTableActivity;

public class ListOfSubjectAndCoursesMainActivity extends AppCompatActivity {

    Button buttoncs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_subject_and_courses_main);

        buttoncs = (Button) findViewById(R.id.buttoncs);

        buttoncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListOfSubjectAndCoursesMainActivity.this, ComputerScienceInfo.class));
            }
        });
    }
}