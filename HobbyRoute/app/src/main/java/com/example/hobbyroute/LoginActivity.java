package com.example.hobbyroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.hobbyroute.model.UserData;

public class LoginActivity extends BaseActivity {
    ImageButton signinButton;
    ImageButton signupButton;
    ImageButton nonButton;
    EditText idEdit;
    EditText pwEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signinButton = findViewById(R.id.button_signIn);
        signupButton = findViewById(R.id.button_signUp);
        nonButton = findViewById(R.id.button_non);
        idEdit = findViewById(R.id.edit_id);
        pwEdit = findViewById(R.id.edit_pw);
    }


    public void onClickSignIn(View view) {
        //Todo: SignIn - id, pw 확인 및 적용

        Intent intent = new Intent(this, RecommendationTypeActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickSignUp(View view) {
        //Todo: SignUp - 새로운 Activity
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickNonMember(View view) {
        //Todo: NonMember - id, pw non-member로 로그인
        Intent intent = new Intent(this, RecommendationTypeActivity.class);
//        intent.putExtra("id", value);

        startActivity(intent);
        finish();
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickMenu(View view){
        super.menu(view);
    }
}