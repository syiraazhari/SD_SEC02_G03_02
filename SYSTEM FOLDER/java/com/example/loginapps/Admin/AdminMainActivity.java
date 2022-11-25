package com.example.loginapps.Admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.loginapps.Lecturer.ListOfSubjectAndCoursesMainActivity;
import com.example.loginapps.Page.MainActivity;
import com.example.loginapps.Profile.ProfileActivity;
import com.example.loginapps.R;
import com.example.loginapps.Lecturer.StudentList;
import com.google.firebase.auth.FirebaseAuth;

public class AdminMainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    //private Button logout;


    CardView cardStudentList;
    CardView cardListOfCourses;

   // CardView cardEditProfile;
    CardView cardLogout;

    CardView cardLecturerList;
    CardView cardStaffList;
    CardView cardViewStudents;



    //qrcode


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin_main);

        firebaseAuth = FirebaseAuth.getInstance();


        //card

        cardStudentList= findViewById(R.id.cardStudentList);
        cardStaffList= findViewById(R.id.cardStaffList);
        cardLecturerList= findViewById(R.id.cardLecturerList);

        //cardScanQRCode = findViewById(R.id.cardScanQRCode);
        //cardRegisterSubject = findViewById(R.id.cardRegisterSubject);
        //cardViewTimetable = findViewById(R.id.cardViewExamTimetable);
        //cardEditProfile = findViewById(R.id.cardEditProfile);
        //cardExamRules = findViewById(R.id.cardExamRules);
        cardLogout = findViewById(R.id.cardLogout);
        cardViewStudents= findViewById(R.id.cardViewStudents);
        cardListOfCourses = findViewById(R.id.cardListOfCourses);
        cardLogout = findViewById(R.id.cardLogout);

        //card
        cardStudentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(AdminMainActivity.this , ViewStudents.class)));
            }
        });

        cardLecturerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(AdminMainActivity.this , ViewLecturers.class)));
            }
        });

        cardStaffList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(AdminMainActivity.this , ViewStaffs.class)));
            }
        });

        cardViewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(AdminMainActivity.this , StudentList.class)));
            }
        });

        cardListOfCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(AdminMainActivity.this,
                        ListOfSubjectAndCoursesMainActivity.class)));
            }
        });

//        O

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showToast("Logout Clicked");
                Logout();
            }
        });



    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    private void Logout() {
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(AdminMainActivity.this, MainActivity.class));
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
                startActivity((new Intent(AdminMainActivity.this , ProfileActivity.class)));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}


