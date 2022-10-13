package com.example.loginapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExaminationRulesActivity extends AppCompatActivity {

    TextView monday;
    TextView Monday;
    TextView Friday;
    TextView Wednesday;
    TextView cs;
    TextView vb;
    TextView da;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examination_rules);

        monday = findViewById(R.id.monday);
        Monday = findViewById(R.id.Monday);
        Wednesday = findViewById(R.id.Wednesday);
        Friday = findViewById(R.id.Friday);
        cs = findViewById(R.id.cs);
        vb = findViewById(R.id.vb);
        da = findViewById(R.id.da);
    }
}