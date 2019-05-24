package com.moon.service;

import com.moon.pojo.Contents;

import java.util.List;

public interface IContentsService {

    List<Contents> selectContentBy();

    int insertSelective(Contents record);
}
