package com.example.pangxiezi.single.view;

import com.example.pangxiezi.single.bean.ArticleDataEntity;

import java.util.List;

/**
 * Created by COSCO on 2016/3/17.
 */
public interface ArticleView {

    void showError();

    void getArticleData(List<ArticleDataEntity> list);

}
