package com.moon.dao;

import com.moon.pojo.WebSiteSetting;
import com.moon.pojo.WebSiteSettingExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WebSiteSettingMapper {
    int countByExample(WebSiteSettingExample example);

    int deleteByExample(WebSiteSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WebSiteSetting record);

    int insertSelective(WebSiteSetting record);

    List<WebSiteSetting> selectByExample(@Param("start")Integer start,@Param("limit")Integer limit);

    WebSiteSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WebSiteSetting record, @Param("example") WebSiteSettingExample example);

    int updateByExample(@Param("record") WebSiteSetting record, @Param("example") WebSiteSettingExample example);

    int updateByPrimaryKeySelective(WebSiteSetting record);

    int updateByPrimaryKey(WebSiteSetting record);
}