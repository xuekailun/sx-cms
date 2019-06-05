package com.moon.service;

import com.moon.pojo.OperationLog;

import java.util.List;

public interface IOperationLogService {

    int insertSelective(OperationLog record);

    List<OperationLog> selectAll(String title,Integer start,Integer limit);
}
