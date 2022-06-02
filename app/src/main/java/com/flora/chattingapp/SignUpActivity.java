package com.flora.chattingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

public class SignUpActivity extends AppCompatActivity {
    private EditText editTextEmailSignUp, editTextPasswordSignUp, editTextUserNameSignUp;
    private Button buttonRegister;
    private ShapeableImageView profileImage;

    private Boolean imageControl = false;

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

        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageChooser();
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmailSignUp.getText().toString();
                String password = editTextPasswordSignUp.getText().toString();
                String userName = editTextUserNameSignUp.getText().toString();

                if (!email.equals("") && !password.equals("") && !userName.equals("")){
                    signUp(email, password, userName);
                }
            }
        });
    }

    public void imageChooser(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null){
            Uri imageUri = data.getData();
            Glide.with(this).load(imageUri).into(profileImage);
            imageControl = true;
        }   else {
            imageControl = false;
        }
    }

    public void signUp(String email, String password, String userName){

    }
}