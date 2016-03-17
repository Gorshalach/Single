package com.example.pangxiezi.single.bean;

import java.util.List;

/**
 * Created by COSCO on 2016/3/17.
 */
public class ArticleDataEntity {

    /**
     * id : 291815
     * uid : 186492
     * name :
     * title : 现今的电影 不是电影
     * excerpt : 徐皓峰的电影哲学是，活着就要有品相地活着。然而在商业世界里，电影是赖活着。最近正在上映的《箭士柳白猿》是在他拍摄三年之后，第一次走进大众院线。
     * lead : 我们百年来的习惯动作，不是确立民族优质，而是诋毁民族优质。五四以来的名人，都在做民族批判。几位导演有建立民族优质的自觉，但上上下下都没有这个需求，没有大方向的共识和热情，也就无力了，整体迷失。
     * model : 1
     * position : 0
     * thumbnail : http://img.owspace.com/Public/uploads/Picture/2016-03-14/56e6886cdd2c2.png
     * create_time : 1458000000
     * update_time : 2016/03/15
     * tags : []
     * status : 1
     * video :
     * fm :
     * link_url :
     * publish_time : 0
     * view : 8.9w
     * share : http://static.owspace.com/wap/291815.html
     * comment : 33
     * good : 115
     * bookmark : 0
     * show_uid : 186492
     * fm_play :
     * hot_comments : []
     * html5 : http://static.owspace.com/wap/291815.html
     * author : 徐皓峰
     * tpl : 1
     * avatar : http://img.owspace.com/Public/static/avatar/3.png
     * category : TO READ
     */

    private String id;
    private String uid;
    private String name;
    private String title;
    private String excerpt;
    private String lead;
    private String model;
    private String position;
    private String thumbnail;
    private String create_time;
    private String update_time;
    private String status;
    private String video;
    private String fm;
    private String link_url;
    private String publish_time;
    private String view;
    private String share;
    private String comment;
    private String good;
    private String bookmark;
    private String show_uid;
    private String fm_play;
    private String html5;
    private String author;
    private int tpl;
    private String avatar;
    private String category;
    private List<ArticleTagsEntity> tags;
    private List<ArticleHotComments> hot_comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(String publish_time) {
        this.publish_time = publish_time;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public String getShow_uid() {
        return show_uid;
    }

    public void setShow_uid(String show_uid) {
        this.show_uid = show_uid;
    }

    public String getFm_play() {
        return fm_play;
    }

    public void setFm_play(String fm_play) {
        this.fm_play = fm_play;
    }

    public String getHtml5() {
        return html5;
    }

    public void setHtml5(String html5) {
        this.html5 = html5;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTpl() {
        return tpl;
    }

    public void setTpl(int tpl) {
        this.tpl = tpl;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<ArticleTagsEntity> getTags() {
        return tags;
    }

    public void setTags(List<ArticleTagsEntity> tags) {
        this.tags = tags;
    }

    public List<ArticleHotComments> getHot_comments() {
        return hot_comments;
    }

    public void setHot_comments(List<ArticleHotComments> hot_comments) {
        this.hot_comments = hot_comments;
    }

}
