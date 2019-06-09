package com.moon.service.impl;

import com.moon.dao.WebSiteSettingMapper;
import com.moon.pojo.WebSiteSetting;
import com.moon.service.IWebSiteSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSiteSettingServiceImpl implements IWebSiteSettingService {

    private final WebSiteSettingMapper webSiteSettingMapper;

    @Autowired
    public WebSiteSettingServiceImpl(WebSiteSettingMapper webSiteSettingMapper) {
        this.webSiteSettingMapper = webSiteSettingMapper;
    }


    public int insertSelective(WebSiteSetting record){
        return webSiteSettingMapper.insertSelective(record);
    }

    public List<WebSiteSetting> selectByExample(Integer start, Integer limit){
        start=(start-1)*limit;
        return webSiteSettingMapper.selectByExample(start, limit);
    }

    public WebSiteSetting selectByPrimaryKey(Integer id){
        return webSiteSettingMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(WebSiteSetting record){
        return webSiteSettingMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteByPrimaryKey(Integer id){
        return webSiteSettingMapper.deleteByPrimaryKey(id);
    }
}
