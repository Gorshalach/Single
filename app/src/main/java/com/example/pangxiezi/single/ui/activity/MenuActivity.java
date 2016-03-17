package com.example.pangxiezi.single.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.pangxiezi.single.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MenuActivity extends BaseActivity implements View.OnClickListener {


    @Bind(R.id.menu_exit_ibtn)
    ImageButton menuExitIbtn;
    @Bind(R.id.menu_setting_ibtn)
    ImageButton menuSettingIbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        initEvent();
    }

    private void initEvent() {
        menuExitIbtn.setOnClickListener(this);
        menuSettingIbtn.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu_exit_ibtn:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.menu_setting_ibtn:
                startActivity(new Intent(this, SettingActivity.class));
                break;
        }
    }
}
