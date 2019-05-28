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

    int insertWeaveConstruction(WeaveConstruction record);


    int insertSelective(WeaveConstruction record);

    List<WeaveConstruction> selectByExample(WeaveConstructionExample example);

    WeaveConstruction selectByPrimaryKey(Integer wId);

    List<WeaveConstruction> selectByPid(Integer pId);

    List<WeaveConstruction> selectById(Integer Id);

    int updateByExampleSelective(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByExample(@Param("record") WeaveConstruction record, @Param("example") WeaveConstructionExample example);

    int updateByPrimaryKeySelective(WeaveConstruction record);

    int updateByPrimaryKey(WeaveConstruction record);

    /* 查询栏目除跟目录 */
    List<WeaveConstruction> selectAll();

    List<WeaveConstruction> selectAllByCaseWhen(@Param("start")Integer start,@Param("limit")Integer limit);

    List<WeaveConstruction> selectPidByCaseWhen(@Param("pid")Integer pid,@Param("start")Integer start,@Param("limit")Integer limit);

    /* 查询栏目是否在导航栏显示，如果不在导航栏显示，是否主页显示*/
    List<WeaveConstruction> selectByIsShow(@Param("isShow") String isShow,@Param("isList") String isList);
}