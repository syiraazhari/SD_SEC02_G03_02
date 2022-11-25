package com.example.loginapps.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginapps.R;

public class TimeTableActivity extends AppCompatActivity {

    Button buttoncs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        buttoncs = (Button) findViewById(R.id.buttoncs);

        buttoncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TimeTableActivity.this, ComputerScienceTable.class));
            }
        });


    }
}

