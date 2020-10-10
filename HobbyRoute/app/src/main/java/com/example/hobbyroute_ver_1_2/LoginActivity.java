package com.example.hobbyroute_ver_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageButton button = (ImageButton) findViewById(R.id.loginbtn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               //Error occurred while trying to add tracking function to login function before presentation.
               // I will add it after taking action.
               // I already took a video of me being logged in and attached it as a group message.
            }
        });

        ImageButton nonmemberbtn = (ImageButton) findViewById(R.id.nonmemberbtn);
        nonmemberbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
                startActivity(intent);
            }

        });

    }
}