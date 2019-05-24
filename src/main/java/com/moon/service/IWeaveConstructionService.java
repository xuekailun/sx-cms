package com.moon.service;

import com.moon.pojo.WeaveConstruction;

import java.util.List;

public interface IWeaveConstructionService {

    int insertSelective(WeaveConstruction record);

    /**
     * 获取树
     * @param
     * @return
     */
    List getColumns();

    List<WeaveConstruction> selectAll();

    List<WeaveConstruction> selectByPid(Integer pid);


    /***
     * 通过id 去查询栏目名称
     * @param Id
     * @return
     */
    WeaveConstruction selectById(Integer Id);
}
