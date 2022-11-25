package com.example.loginapps.Pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.loginapps.R;
import com.github.barteksc.pdfviewer.PDFView;

public class LecturerPdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_pdf);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("ListNameLecturer.pdf").load();
    }
}

