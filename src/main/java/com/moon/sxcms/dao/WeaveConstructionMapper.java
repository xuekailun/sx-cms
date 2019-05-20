package com.moon.sxcms.dao;


import com.moon.sxcms.pojo.WeaveConstruction;
import com.moon.sxcms.pojo.WeaveConstructionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeaveConstructionMapper {
    int countByExample(WeaveConstructionExample example);

    int deleteByExample(WeaveConstructionExample example);

    int deleteByPrimaryKey(Integer wId);

    int insert(WeaveConstruction record);

    int insertSelective(WeaveConstruction record);

    List<WeaveConstruction> selectByExample(WeaveConstructionExample example);

    WeaveConstruction selectByPrimaryKey(Integer wId);

    int updateByExampleSelective(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByExample(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByPrimaryKeySelective(WeaveConstruction record);

    int updateByPrimaryKey(WeaveConstruction record);
}