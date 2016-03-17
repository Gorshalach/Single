package com.example.pangxiezi.single.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.pangxiezi.single.R;
import com.example.pangxiezi.single.ui.widget.GestureListener;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    @Bind(R.id.ment_ibtn)
    ImageButton mentIbtn;
    @Bind(R.id.user_ibtn)
    ImageButton userIbtn;
    @Bind(R.id.main_layout)
    RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initEvent();
        mainLayout.setLongClickable(true);
        mainLayout.setOnTouchListener(new MyGestureListener(this));
//        startActivity(new Intent(this, ArticleActivity.class));

    }

    private void initEvent() {
        mentIbtn.setOnClickListener(this);
        userIbtn.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ment_ibtn:
                startActivity(new Intent(this, MenuActivity.class));
                overridePendingTransition(R.anim.in_from_left, R.anim.out_from_right);
                break;
            case R.id.user_ibtn:
                startActivity(new Intent(this, UserActivity.class));
                overridePendingTransition(R.anim.in_from_right, R.anim.out_from_left);
                break;
        }
    }

    /**
     * 继承GestureListener，重写left和right方法
     */
    private class MyGestureListener extends GestureListener {
        public MyGestureListener(Context context) {
            super(context);
        }

        @Override
        public boolean left() {
            Log.e("test", "向左滑");
            startActivity(new Intent(MainActivity.this, UserActivity.class));
            overridePendingTransition(R.anim.in_from_right, R.anim.out_from_left);
            return super.left();
        }

        @Override
        public boolean right() {
            Log.e("test", "向右滑");
            startActivity(new Intent(MainActivity.this, MenuActivity.class));
            overridePendingTransition(R.anim.in_from_left, R.anim.out_from_right);
            return super.right();
        }
    }

}
