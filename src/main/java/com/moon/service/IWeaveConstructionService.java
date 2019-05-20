package com.moon.service;

import com.moon.pojo.WeaveConstruction;

import java.util.List;

public interface IWeaveConstructionService {

    List<WeaveConstruction> selectByPid(Integer pId);
}
