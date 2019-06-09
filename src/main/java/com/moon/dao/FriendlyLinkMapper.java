package com.moon.dao;

import com.moon.pojo.FriendlyLink;
import com.moon.pojo.FriendlyLinkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FriendlyLinkMapper {
    int countByExample(FriendlyLinkExample example);

    int deleteByExample(FriendlyLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FriendlyLink record);

    int insertSelective(FriendlyLink record);

    List<FriendlyLink> selectByExample(@Param("start")Integer start,@Param("limit")Integer limit);

    FriendlyLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByExample(@Param("record") FriendlyLink record, @Param("example") FriendlyLinkExample example);

    int updateByPrimaryKeySelective(FriendlyLink record);

    int updateByPrimaryKey(FriendlyLink record);
}