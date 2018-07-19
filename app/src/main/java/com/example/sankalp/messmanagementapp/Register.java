package com.example.sankalp.messmanagementapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    Button signup;
    TextView log;
    EditText usr, pass;
    ProgressBar pb;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        signup = findViewById(R.id.btn1);
        log = findViewById(R.id.log);
        usr = findViewById(R.id.email1);
        pass = findViewById(R.id.pwd1);
        pb = findViewById(R.id.progress);
        mAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(usr.getText().toString().trim())) {
                    Toast.makeText(getApplicationContext(), "Enter Email Address", Toast.LENGTH_LONG).show();
                }
                if (TextUtils.isEmpty(pass.getText().toString().trim())) {
                    Toast.makeText(getApplicationContext(), "Enter Password", Toast.LENGTH_LONG).show();
                }
                if (pass.getText().toString().length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password should contain atleast 6 characters", Toast.LENGTH_LONG).show();
                }
                pb.setVisibility(View.VISIBLE);
                //create user
                mAuth.createUserWithEmailAndPassword(usr.getText().toString().trim(), pass.getText().toString().trim()).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        pb.setVisibility(View.GONE);
                        //Task not success show an error
                        if (!task.isSuccessful())
                            Toast.makeText(getApplicationContext(), "Failed To Register", Toast.LENGTH_SHORT).show();
                        else
                            startActivity(new Intent(Register.this, Order_Type.class));
                    }
                });
                usr.setText(null);
                pass.setText(null);
            }

        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this,SlimpleTextClientActivity.class));
            }
        });

    }
}

