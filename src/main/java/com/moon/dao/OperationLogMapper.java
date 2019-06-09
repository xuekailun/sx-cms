package com.moon.dao;

import com.moon.pojo.OperationLog;
import com.moon.pojo.OperationLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OperationLogMapper {
    int countByExample(OperationLogExample example);

    int deleteByExample(OperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLog record);

    int insertSelective(OperationLog record);

    List<OperationLog> selectByExample(OperationLogExample example);

    List<OperationLog> selectAll(@Param("title") String title,@Param("start")Integer start,@Param("limit")Integer limit);

    int selectCount();

    OperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    int updateByPrimaryKeySelective(OperationLog record);

    int updateByPrimaryKey(OperationLog record);
}