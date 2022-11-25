package com.example.loginapps.Both;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.loginapps.R;

public class ComputerScienceInfo extends AppCompatActivity {

    TextView Monday;
    TextView Friday;
    TextView Wednesday;
    TextView cs;
    TextView vb;
    TextView da;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science_info);

        Monday = findViewById(R.id.Monday);
        Wednesday = findViewById(R.id.Wednesday);
        Friday = findViewById(R.id.Friday);
        cs = findViewById(R.id.cs);
        vb = findViewById(R.id.vb);
        da = findViewById(R.id.da);
    }
}

