package com.moon.service.impl;

import com.moon.dao.WeaveConstructionMapper;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaveConstructionServiceImpl implements IWeaveConstructionService {

    private final WeaveConstructionMapper weaveConstructionMapper;

    @Autowired
    public WeaveConstructionServiceImpl(WeaveConstructionMapper weaveConstructionMapper) {
        this.weaveConstructionMapper = weaveConstructionMapper;
    }

    public List<WeaveConstruction> selectByPid(Integer pId){
        return weaveConstructionMapper.selectByPid(pId);
    }
}
