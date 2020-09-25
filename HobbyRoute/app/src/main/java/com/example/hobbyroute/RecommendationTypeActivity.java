package com.example.hobbyroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecommendationTypeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword);
    }

    public void onClickSurprise(View view) {
        Intent intent = new Intent(this, KeywordActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickShow(View view) {
        Intent intent = new Intent(this, RollingSelectActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickMenu(View view) {
        super.menu(view);
    }
}