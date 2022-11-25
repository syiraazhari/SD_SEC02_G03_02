package com.example.loginapps.Staff;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.loginapps.Both.ExaminationRulesActivity;
import com.example.loginapps.Lecturer.GenerateQrCodeActivity;
import com.example.loginapps.Lecturer.ListOfSubjectAndCoursesMainActivity;
import com.example.loginapps.Page.MainActivity;
import com.example.loginapps.Profile.ProfileActivity;
import com.example.loginapps.R;
import com.example.loginapps.Student.TimeTableActivity;
import com.example.loginapps.Lecturer.StudentList;
import com.example.loginapps.Profile.UpdateProfile;
import com.google.firebase.auth.FirebaseAuth;

public class StaffMainActivity extends AppCompatActivity {

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
    CardView cardViewStudents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_main);

        firebaseAuth = FirebaseAuth.getInstance();


        //card
        cardHome = findViewById(R.id.cardHome);
        cardGenerateQRCode = findViewById(R.id.cardGenerateQRCode);
        cardListOfCourses = findViewById(R.id.cardListOfCourses);
        cardViewTimetable = findViewById(R.id.cardViewExamTimetable);
        cardEditProfile = findViewById(R.id.cardEditProfile);
        cardLogout = findViewById(R.id.cardLogout);
        cardExamRules = findViewById(R.id.cardExamRules);
        cardViewStudents = findViewById(R.id.cardViewStudents);

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
                startActivity(new Intent(StaffMainActivity.this, GenerateQrCodeActivity.class));

            }
        });

        cardListOfCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("List Of Courses and Subjects Clicked");
                startActivity(new Intent(StaffMainActivity.this,
                        ListOfSubjectAndCoursesMainActivity.class));

            }
        });

        cardViewTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("View Exam Timetable");
                startActivity(new Intent(StaffMainActivity.this, TimeTableActivity.class));
            }
        });

        cardEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Edit Profile");
                startActivity((new Intent(StaffMainActivity.this , UpdateProfile.class)));
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
                startActivity((new Intent(StaffMainActivity.this ,
                        ExaminationRulesActivity.class)));
            }
        });

        cardViewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(StaffMainActivity.this , StudentList.class)));
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(StaffMainActivity.this, MainActivity.class));
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
                startActivity((new Intent(StaffMainActivity.this , ProfileActivity.class)));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
