package com.example.pangxiezi.single.model;


import com.example.pangxiezi.single.bean.ArticleEntity;

import retrofit2.Callback;

/**
 * Created by COSCO on 2016/3/16.
 */
public interface ArticleModel {

    void getArticleData(int page, int page_id, int create_time, int model, Callback<ArticleEntity> callback);

}
