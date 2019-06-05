package com.moon.service.impl;

import com.moon.dao.OperationLogMapper;
import com.moon.pojo.OperationLog;
import com.moon.service.IOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationLogServiceImpl implements IOperationLogService {

    private final OperationLogMapper operationLogMapper;

    @Autowired
    public OperationLogServiceImpl(OperationLogMapper operationLogMapper) {
        this.operationLogMapper = operationLogMapper;
    }

    public int insertSelective(OperationLog record){
        return operationLogMapper.insertSelective(record);
    }

    public List<OperationLog> selectAll(String title,Integer start,Integer limit){
        start=(start-1)*limit;
        return operationLogMapper.selectAll(title,start,limit);
    }
}
