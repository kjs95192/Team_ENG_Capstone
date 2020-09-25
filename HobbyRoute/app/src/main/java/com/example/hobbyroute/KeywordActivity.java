package com.example.hobbyroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KeywordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword);
    }

    public void onClickComplete(View view) {
        Intent intent = new Intent(this, HobbyRecommendationActivity.class);
//        intent.putExtra()
        startActivity(intent);
        finish();
    }

    public void onClickSkip(View view) {
        Intent intent = new Intent(this, HobbyRecommendationActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, RecommendationTypeActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickMenu(View view) {
        super.menu(view);
    }
}