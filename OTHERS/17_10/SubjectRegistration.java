package com.example.loginapps.Student;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginapps.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class SubjectRegistration extends AppCompatActivity {

    DatabaseReference dbref;
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

    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;


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

        dbref = FirebaseDatabase.getInstance().getReference("Computer Science Registration");


    }
}