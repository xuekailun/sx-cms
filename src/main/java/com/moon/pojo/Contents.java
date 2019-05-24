package com.moon.pojo;

import java.util.Date;

public class Contents {
    private Integer id;

    private String title;

    private String keyword;

    private String summary;

    private String style;

    private String thumbnail;

    private Date insertdate;

    private Date updatedate;

    private Integer stick;

    private Date stickdate;

    private Integer wcid;

    private Integer ishref;

    private String hrefs;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Date getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(Date insertdate) {
        this.insertdate = insertdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getStick() {
        return stick;
    }

    public void setStick(Integer stick) {
        this.stick = stick;
    }

    public Date getStickdate() {
        return stickdate;
    }

    public void setStickdate(Date stickdate) {
        this.stickdate = stickdate;
    }

    public Integer getWcid() {
        return wcid;
    }

    public void setWcid(Integer wcid) {
        this.wcid = wcid;
    }

    public Integer getIshref() {
        return ishref;
    }

    public void setIshref(Integer ishref) {
        this.ishref = ishref;
    }

    public String getHrefs() {
        return hrefs;
    }

    public void setHrefs(String hrefs) {
        this.hrefs = hrefs == null ? null : hrefs.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}