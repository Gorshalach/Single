package com.example.pangxiezi.single.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.pangxiezi.single.R;
import com.example.pangxiezi.single.bean.ArticleDataEntity;
import com.example.pangxiezi.single.presenter.ArticlePresenter;
import com.example.pangxiezi.single.presenter.impl.ArticlePresenterImpl;
import com.example.pangxiezi.single.ui.adapter.ArticleAdapter;
import com.example.pangxiezi.single.ui.widget.DividerItemDecoration;
import com.example.pangxiezi.single.view.ArticleView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by COSCO on 2016/3/17.
 */
public class ArticleActivity extends BaseActivity implements ArticleView, SwipeRefreshLayout.OnRefreshListener, ArticleAdapter.OnChildClickListener {

    private static final String URL = "URL";

    @Bind(R.id.article_swipe)
    SwipeRefreshLayout articleSwipe;
    @Bind(R.id.article_recycler)
    RecyclerView articleRecycler;
//    @Bind(R.id.toolbar)
//    Toolbar toolbar;

    private boolean isRefresh = false;//下拉加载判断

    private ArticlePresenter articlePresenter;

    private int page = 1;
    private int page_id = 0;
    private int create_time = 0;
    private int model = 1;

    private ArticleAdapter adapter;
    private List<ArticleDataEntity> articleDataEntities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        ButterKnife.bind(this);


//        setSupportActionBar(toolbar);
//        setTitle("文字");
//        setTitleColor(Color.WHITE);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //p=1&model=1&page_id=0&create_time=0
        articlePresenter = new ArticlePresenterImpl(page, page_id, create_time, model, this);
        articlePresenter.getArticleData();

        articleRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        articleRecycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
//        adapter.setOnChildClickListener(this);//空指针异常

        articleSwipe.setOnRefreshListener(this);
    }

    @Override
    public void showError() {
        Toast.makeText(this, "网络加载错误......", Toast.LENGTH_LONG).show();
    }

    @Override
    public void getArticleData(List<ArticleDataEntity> list) {
        articleDataEntities = list;
        adapter = new ArticleAdapter(this, articleDataEntities);
        if (articleRecycler != null) {
            articleRecycler.setAdapter(adapter);
        }
        adapter.setOnChildClickListener(this);

        if (!isRefresh) {
            articleSwipe.setRefreshing(isRefresh);
            adapter.notifyDataSetChanged();
        }
        isRefresh = true;

    }

    @Override
    public void onChildClick(View child, int positon, String url) {
        Toast.makeText(this, url, Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, DetailActivity.class);
//        intent.putExtra(URL, url);
//        startActivity(intent);
    }

    @Override
    public void onRefresh() {
        articleDataEntities.clear();
        if (articleDataEntities == null) {
            articlePresenter.getArticleData();
            isRefresh = false;
        }
    }

}
