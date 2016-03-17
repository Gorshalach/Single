package com.example.pangxiezi.single.model.impl;

import com.example.pangxiezi.single.api.ApiConstant;
import com.example.pangxiezi.single.bean.ArticleEntity;
import com.example.pangxiezi.single.model.ArticleModel;
import com.example.pangxiezi.single.model.BaseModel;
import com.example.pangxiezi.single.utils.ParamsMap;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by COSCO on 2016/3/16.
 */
public class ArticleModelImpl extends BaseModel implements ArticleModel {

    @Override
    public void getArticleData(int page, int page_id, int create_time, int model, Callback<ArticleEntity> callback) {

        ParamsMap map = new ParamsMap();
        map.put(ApiConstant.DefaultKey.P_KEY, page);
        map.put(ApiConstant.DefaultKey.MODEL_KEY, model);
        map.put(ApiConstant.DefaultKey.CREATE_TIME_KEY, create_time);
        map.put(ApiConstant.DefaultKey.PAGE_ID_KEY, page_id);

        Call<ArticleEntity> call = service.getArticleEntity(map);
        call.enqueue(callback);

    }

}
