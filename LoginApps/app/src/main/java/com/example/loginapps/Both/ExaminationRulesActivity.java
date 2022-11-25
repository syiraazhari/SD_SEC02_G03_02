package com.example.loginapps.Both;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.loginapps.R;
import com.github.barteksc.pdfviewer.PDFView;

public class ExaminationRulesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examination_rules);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("ExaminationRegulation.pdf").load();
    }
}

