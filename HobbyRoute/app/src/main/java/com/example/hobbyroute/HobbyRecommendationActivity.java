package com.example.hobbyroute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class HobbyRecommendationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobby_recommendation);
    }

    public void onClickMenu(View view) {
        super.menu(view);
    }
}