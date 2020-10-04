package com.hobbyroute;

import android.os.Bundle;
import android.view.View;

public class RouteviewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routeview);
    }

    public void onClickMenu(View view) {
        super.menu(view);
    }
}