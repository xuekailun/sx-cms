package com.moon.service;

import com.moon.pojo.WebSiteSetting;

import java.util.List;

public interface IWebSiteSettingService {

    int insertSelective(WebSiteSetting record);

    List<WebSiteSetting> selectByExample(Integer start, Integer limit);

    WebSiteSetting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebSiteSetting record);

    int deleteByPrimaryKey(Integer id);
}
