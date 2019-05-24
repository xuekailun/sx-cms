package com.moon.service.impl;

import com.moon.dao.ContentsMapper;
import com.moon.pojo.Contents;
import com.moon.service.IContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentsServiceImpl implements IContentsService {

    private final ContentsMapper contentsMapper;

    @Autowired
    public ContentsServiceImpl(ContentsMapper contentsMapper) {
        this.contentsMapper = contentsMapper;
    }

    public List<Contents> selectContentBy(){
        return contentsMapper.selectContentBy();
    }

    public int insertSelective(Contents record){
        return contentsMapper.insertSelective(record);
    }
}
