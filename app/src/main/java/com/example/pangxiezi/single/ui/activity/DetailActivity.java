package com.example.pangxiezi.single.ui.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.pangxiezi.single.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by COSCO on 2016/3/17.
 */
public class DetailActivity extends BaseActivity {

    private static final String URL = "URL";


    @Bind(R.id.detail_web)
    WebView detailWeb;
//    @Bind(R.id.detail_toolbar)
//    Toolbar detailToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        String url = getIntent().getStringExtra(URL);

//        setSupportActionBar(detailToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        detailWeb.loadUrl(url);
//        detailWeb.setWebViewClient(new WebViewClient());

//        initView(String url);

        initView(url);


    }

    private void initView(String url) {
        detailWeb.loadUrl(url);
        detailWeb.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        detailWeb.getSettings().setUseWideViewPort(true);//设置此属性，可任意比例缩放
        detailWeb.getSettings().setLoadWithOverviewMode(true);//将图片调整到适合webview的大小
        detailWeb.getSettings().setJavaScriptEnabled(true);  //支持js
    }

    //    private void initView(String url) {
//        init(url);
//    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {//使按下回退键时回到上一个页面而不是推出整个程序
        if ((keyCode == KeyEvent.KEYCODE_BACK) && detailWeb.canGoBack()) {
            detailWeb.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
