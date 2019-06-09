package com.moon.service;

import com.moon.pojo.FriendlyLink;

import java.util.List;

public interface IFriendlyLinkService {

    int insertSelective(FriendlyLink record);

    int deleteByPrimaryKey(Integer id);

    /***
     * 查询全部的友情链接
     * @return
     */
    List<FriendlyLink> selectByExample(Integer start,Integer limit);

    int updateByPrimaryKeySelective(FriendlyLink record);

    FriendlyLink selectByPrimaryKey(Integer id);
}
