package com.moon.dao;


import com.moon.pojo.WeaveConstruction;
import com.moon.pojo.WeaveConstructionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WeaveConstructionMapper {
    int countByExample(WeaveConstructionExample example);

    int deleteByExample(WeaveConstructionExample example);

    int deleteByPrimaryKey(Integer wId);

    int insert(WeaveConstruction record);

    int insertSelective(WeaveConstruction record);

    List<WeaveConstruction> selectByExample(WeaveConstructionExample example);

    WeaveConstruction selectByPrimaryKey(Integer wId);

    List<WeaveConstruction> selectByPid(Integer pId);

    int updateByExampleSelective(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByExample(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByPrimaryKeySelective(WeaveConstruction record);

    int updateByPrimaryKey(WeaveConstruction record);
}