package com.example.loginapps.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.loginapps.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ScanQRCodeActivity extends AppCompatActivity {

    Button qrbtn;
    public static TextView qrtext;
    private FirebaseDatabase firebaseDatabase2;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qrcode);

        qrbtn = (Button)findViewById(R.id.qrbtn);
        qrtext = (TextView)findViewById(R.id.qrtext);
        DatabaseReference databaseReference = firebaseDatabase2.getReference(firebaseAuth.getUid());

                qrbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(getApplicationContext(), qrscanner.class));

                    }
                });
    }
}

