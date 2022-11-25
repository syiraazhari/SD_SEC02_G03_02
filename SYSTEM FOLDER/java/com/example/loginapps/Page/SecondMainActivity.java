package com.example.loginapps.Page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginapps.Lecturer.LecturerLogin;
import com.example.loginapps.Login.AdminLogin;
import com.example.loginapps.Login.StaffLogin;
import com.example.loginapps.R;

public class SecondMainActivity extends AppCompatActivity {


    private Button Lecturerlogin;
    private Button stafflogin;
    private Button adminlogin;
    //private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);


        Lecturerlogin = (Button) findViewById(R.id.lecturerlogin);
        stafflogin = (Button) findViewById(R.id.stafflogin);
        adminlogin = (Button) findViewById(R.id.adminlogin);

        Lecturerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondMainActivity.this, LecturerLogin.class));

            }
        });


        stafflogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondMainActivity.this, StaffLogin.class));
            }
        });

        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondMainActivity.this, AdminLogin.class));
            }
        });

    }
}



