package com.moon.service;

import com.moon.pojo.OperationLog;

public interface IOperationLogService {

    int insertSelective(OperationLog record);
}
