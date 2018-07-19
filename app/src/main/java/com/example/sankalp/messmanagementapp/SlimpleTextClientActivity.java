package com.example.sankalp.messmanagementapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SlimpleTextClientActivity extends AppCompatActivity {

    EditText user,pass;
    Button login;
    private FirebaseAuth auth;
    TextView sign;

    static int tablex;

    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slimple_text_client);
        user = findViewById(R.id.usr);
        login = findViewById(R.id.login);
        pass = findViewById(R.id.pwd);
        sign = findViewById(R.id.reg);
        auth=FirebaseAuth.getInstance();


        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SlimpleTextClientActivity.this,Register.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(user.getText().toString())) {
                    Toast.makeText(getApplicationContext(),"Enter Email Address",Toast.LENGTH_LONG).show();
                }
                if(TextUtils.isEmpty(pass.getText().toString())) {
                    Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_LONG).show();
                }
                auth.signInWithEmailAndPassword(user.getText().toString(),pass.getText().toString()).addOnCompleteListener(SlimpleTextClientActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()) {
                            // there was an error
                            if (pass.getText().toString().length() < 6) {
                                pass.setError(getString(R.string.minimum_password));
                            } else {
                                Toast.makeText(SlimpleTextClientActivity.this, getString(R.string.auth_failed), Toast.LENGTH_LONG).show();
                            }
                        } else
                            startActivity(new Intent(SlimpleTextClientActivity.this,Order_Type.class));
                    }
                });
            }
        });

    }



    }
