package com.example.pangxiezi.single.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.pangxiezi.single.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class UserActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.user_exit_ibtn)
    ImageButton userExitIbtn;
    @Bind(R.id.user_setting_ibtn)
    ImageButton userSettingIbtn;
    @Bind(R.id.user_login_btn)
    Button userLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        ButterKnife.bind(this);

        initEvent();


    }

    private void initEvent() {
        userExitIbtn.setOnClickListener(this);
        userSettingIbtn.setOnClickListener(this);
        userLoginBtn.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.user_exit_ibtn:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.user_setting_ibtn:
                startActivity(new Intent(this, SettingActivity.class));
                break;
            case R.id.user_login_btn:
                Toast.makeText(this, "请登录......", Toast.LENGTH_LONG).show();
        }
    }
}
