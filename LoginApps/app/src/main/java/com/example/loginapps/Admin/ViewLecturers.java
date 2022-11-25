package com.example.loginapps.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.loginapps.Pdf.LecturerPdfActivity;
import com.example.loginapps.R;

public class ViewLecturers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_lecturers);
        Button button = findViewById(R.id.btnView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewLecturers.this, LecturerPdfActivity.class);
                startActivity(intent);
            }
        });
    }
}

