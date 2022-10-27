package com.example.loginapps.Student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.loginapps.ExaminationRulesActivity;
import com.example.loginapps.MainActivity;
import com.example.loginapps.ProfileActivity;
import com.example.loginapps.R;
import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    //private Button logout;

    //card
    CardView cardHome;
    CardView cardScanQRCode;
    CardView cardRegisterSubject;
    CardView cardViewTimetable;
    CardView cardEditProfile;
    CardView cardLogout;
    CardView cardExamRules;

    //qrcode


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        firebaseAuth = FirebaseAuth.getInstance();


        //card
        cardHome = findViewById(R.id.cardHome);
        cardScanQRCode = findViewById(R.id.cardScanQRCode);
        cardRegisterSubject = findViewById(R.id.cardRegisterSubject);
        cardViewTimetable = findViewById(R.id.cardViewExamTimetable);
        cardEditProfile = findViewById(R.id.cardEditProfile);
        cardExamRules = findViewById(R.id.cardExamRules);
        cardLogout = findViewById(R.id.cardLogout);

        //card
        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showToast("Home Clicked");
            }
        });

        cardScanQRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("QR Code Clicked");
                startActivity(new Intent(SecondActivity.this, ScanQRCodeActivity.class));

            }
        });

        cardRegisterSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Register Clicked");
            }
        });

        cardViewTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("View Timetable Clicked");
                startActivity(new Intent(SecondActivity.this, TimeTableActivity.class));
            }
        });

        cardEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Edit Profile Clicked");
                startActivity((new Intent(SecondActivity.this , ProfileActivity.class)));
            }
        });

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showToast("Logout Clicked");
                Logout();
            }
        });

        cardExamRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(SecondActivity.this , ExaminationRulesActivity.class)));
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this, MainActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.logoutMenu: {
                Logout();
                break;

            }
            case R.id.profileMenu:
                startActivity((new Intent(SecondActivity.this , ProfileActivity.class)));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


