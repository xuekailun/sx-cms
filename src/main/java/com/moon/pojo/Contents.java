package com.moon.pojo;

import lombok.Data;

import java.util.Date;

@Data
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

    private String author;

    private Integer type; // 发布类型

    private String wname;
}