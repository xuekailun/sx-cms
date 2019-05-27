package com.moon.service;

import com.moon.pojo.Contents;

import java.util.List;

public interface IContentsService {

    Integer deleteByPrimaryKey(Integer id);

    Contents selectByPrimaryKey(Integer id);

    List<Contents> selectContentBy(Integer wcid);

    List getColumns();

    int insertSelective(Contents record);
}
