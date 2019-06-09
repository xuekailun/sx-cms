package com.moon.pojo;

import java.io.Serializable;

public class FriendlyLink implements Serializable {
    private Integer id;

    private String name;

    private String url;

    private Short isshow;

    private String logoimg;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Short getIsshow() {
        return isshow;
    }

    public void setIsshow(Short isshow) {
        this.isshow = isshow;
    }

    public String getLogoimg() {
        return logoimg;
    }

    public void setLogoimg(String logoimg) {
        this.logoimg = logoimg == null ? null : logoimg.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}