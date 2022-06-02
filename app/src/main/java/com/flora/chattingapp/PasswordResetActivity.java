package com.flora.chattingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class PasswordResetActivity extends AppCompatActivity {

    private EditText editTextForgetPassword;
    private Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);
        initViews();
    }

    private void initViews() {
        editTextForgetPassword = findViewById(R.id.edt_forget_password);
        btnReset = findViewById(R.id.btn_reset);
    }
}