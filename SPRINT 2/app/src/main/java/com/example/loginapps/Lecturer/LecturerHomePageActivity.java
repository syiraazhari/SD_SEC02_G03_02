package com.example.loginapps.Lecturer;

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
import com.example.loginapps.Student.TimeTableActivity;
import com.example.loginapps.UpdateProfile;
import com.example.loginapps.UserProfile;
import com.google.firebase.auth.FirebaseAuth;

public class LecturerHomePageActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    //private Button logout;

    //card
    CardView cardHome;
    CardView cardGenerateQRCode;
    CardView cardListOfCourses;
    CardView cardViewTimetable;
    CardView cardEditProfile;
    CardView cardLogout;
    CardView cardExamRules;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_home_page);

        firebaseAuth = FirebaseAuth.getInstance();


        //card
        cardHome = findViewById(R.id.cardHome);
        cardGenerateQRCode = findViewById(R.id.cardGenerateQRCode);
        cardListOfCourses = findViewById(R.id.cardListOfCourses);
        cardViewTimetable = findViewById(R.id.cardViewExamTimetable);
        cardEditProfile = findViewById(R.id.cardEditProfile);
        cardLogout = findViewById(R.id.cardLogout);
        cardExamRules = findViewById(R.id.cardExamRules);

        //card
        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Home Clicked");
            }
        });

        cardGenerateQRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Generate QR Code");
                startActivity(new Intent(LecturerHomePageActivity.this, GenerateQrCodeActivity.class));

            }
        });

        cardListOfCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("List Of Courses and Subjects Clicked");
                startActivity(new Intent(LecturerHomePageActivity.this, ListOfSubjectAndCoursesMainActivity.class));

            }
        });

        cardViewTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("View Exam Timetable");
                startActivity(new Intent(LecturerHomePageActivity.this, TimeTableActivity.class));
            }
        });

        cardEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Edit Profile");
                startActivity((new Intent(LecturerHomePageActivity.this , UpdateProfile.class)));
            }
        });



        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Logout");
                Logout();
            }
        });

        cardExamRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(LecturerHomePageActivity.this , ExaminationRulesActivity.class)));
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(LecturerHomePageActivity.this, MainActivity.class));
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
                startActivity((new Intent(LecturerHomePageActivity.this , ProfileActivity.class)));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    }
