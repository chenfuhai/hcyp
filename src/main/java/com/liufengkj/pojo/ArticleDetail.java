package com.liufengkj.pojo;

public class ArticleDetail {
    private Integer adId;

    private Integer adArticleid;

    private String adContent;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdArticleid() {
        return adArticleid;
    }

    public void setAdArticleid(Integer adArticleid) {
        this.adArticleid = adArticleid;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent == null ? null : adContent.trim();
    }
}