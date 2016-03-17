package com.example.pangxiezi.single.presenter.impl;

import com.example.pangxiezi.single.bean.ArticleDataEntity;
import com.example.pangxiezi.single.bean.ArticleEntity;
import com.example.pangxiezi.single.model.ModelFactory;
import com.example.pangxiezi.single.model.impl.ArticleModelImpl;
import com.example.pangxiezi.single.presenter.ArticlePresenter;
import com.example.pangxiezi.single.view.ArticleView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by COSCO on 2016/3/16.
 */
public class ArticlePresenterImpl implements ArticlePresenter {

    private int page;
    private int page_id;
    private int create_time;
    private int model;

    private ArticleView articleView;

    public ArticlePresenterImpl(int page, int page_id, int create_time, int model, ArticleView articleView) {
        this.page = page;
        this.page_id = page_id;
        this.create_time = create_time;
        this.model = model;
        this.articleView = articleView;
    }

    @Override
    public void getArticleData() {
        ArticleModelImpl articleModelImpl = ModelFactory.newInstance().getArticleModelImpl();
        articleModelImpl.getArticleData(page, page_id, create_time, model, new Callback<ArticleEntity>() {
            @Override
            public void onResponse(Call<ArticleEntity> call, Response<ArticleEntity> response) {
                List<ArticleDataEntity> datas = response.body().getDatas();
                articleView.getArticleData(datas);
            }

            @Override
            public void onFailure(Call<ArticleEntity> call, Throwable t) {
                articleView.showError();
            }
        });

    }

}
