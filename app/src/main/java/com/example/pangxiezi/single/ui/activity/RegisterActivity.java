package com.example.pangxiezi.single.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pangxiezi.single.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.register_back_btn)
    ImageButton registerBackBtn;
    @Bind(R.id.login_btn)
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        initEvent();
    }

    private void initEvent() {
        registerBackBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
