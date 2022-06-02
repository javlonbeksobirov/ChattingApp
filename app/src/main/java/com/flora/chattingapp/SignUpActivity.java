package com.flora.chattingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.imageview.ShapeableImageView;

public class SignUpActivity extends AppCompatActivity {
    private EditText editTextEmailSignUp, editTextPasswordSignUp, editTextUserNameSignUp;
    private Button buttonRegister;
    private ShapeableImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
    }

    private void initViews() {

        editTextEmailSignUp = findViewById(R.id.edt_email_sign_up);
        editTextPasswordSignUp = findViewById(R.id.edt_password_sign_up);
        editTextUserNameSignUp = findViewById(R.id.edt_username_sign_up);
        buttonRegister = findViewById(R.id.btn_sign_up);
        profileImage = findViewById(R.id.profileImage);
    }
}