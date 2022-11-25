package com.example.loginapps.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginapps.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

public class SubjectRegistration extends AppCompatActivity {


    Button btnregister;
    EditText subject1;
    EditText subject2;
    EditText subject3;
    EditText subject4;

    String s1, s2, s3, s4, c1, c2, c3, c4;

    EditText code1;
    EditText code2;
    EditText code3;
    EditText code4;

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    TextView examslipregistration;

    private StorageReference storageReference;
    private FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;
    //DatabaseReference database;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_registration);

        btnregister = findViewById(R.id.btnregister);

        subject1 = findViewById(R.id.subject1);
        subject2 = findViewById(R.id.subject2);
        subject3 = findViewById(R.id.subject3);
        subject4 = findViewById(R.id.subject4);

        code1 = findViewById(R.id.code1);
        code2 = findViewById(R.id.code2);
        code3 = findViewById(R.id.code3);
        code4 = findViewById(R.id.code4);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        examslipregistration = findViewById(R.id.examslipregistration);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Computer Science Registration")
                .child(firebaseAuth.getUid());

        s1 = getIntent().getStringExtra("s1");
        s2 = getIntent().getStringExtra("s2");
        s3 = getIntent().getStringExtra("s3");
        s4 = getIntent().getStringExtra("s4");

        c1 = getIntent().getStringExtra("c1");
        c2 = getIntent().getStringExtra("c2");
        c3 = getIntent().getStringExtra("c3");
        c4 = getIntent().getStringExtra("c4");

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertRegistrationData();

                startActivity(new Intent(SubjectRegistration.this, SecondActivity.class));

            }
        });
    }

        private void insertRegistrationData () {
            String s1 = subject1.getText().toString();
            String s2 = subject2.getText().toString();
            String s3 = subject3.getText().toString();
            String s4 = subject4.getText().toString();

            String c1 = code1.getText().toString();
            String c2 = code2.getText().toString();
            String c3 = code3.getText().toString();
            String c4 = code4.getText().toString();

            RegisterString registerString = new RegisterString(s1, s2, s3, s4, c1, c2, c3, c4);

            databaseReference.push().setValue(registerString);
            Toast.makeText(SubjectRegistration.this, "Subject Registration Successful",
                    Toast.LENGTH_SHORT);
    }
    }
