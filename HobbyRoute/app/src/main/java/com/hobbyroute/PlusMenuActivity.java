package com.hobbyroute;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlusMenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus_menu);
    }

    public void onClickSearch(View view) {
        //Todo: 검색
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, PlusMenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickMenu(View view){
        super.menu(view);
    }
}