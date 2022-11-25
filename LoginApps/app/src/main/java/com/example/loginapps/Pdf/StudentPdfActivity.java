package com.example.loginapps.Pdf;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginapps.R;
import com.github.barteksc.pdfviewer.PDFView;

public class StudentPdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_pdf);
        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("ListNameLecturer.pdf").load();
    }
}

