package com.moon.service.impl;

import com.moon.dao.FriendlyLinkMapper;
import com.moon.pojo.FriendlyLink;
import com.moon.service.IFriendlyLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendlyLinkServiceImpl implements IFriendlyLinkService {

    private final FriendlyLinkMapper friendlyLinkMapper;

    @Autowired
    public FriendlyLinkServiceImpl(FriendlyLinkMapper friendlyLinkMapper) {
        this.friendlyLinkMapper = friendlyLinkMapper;
    }

    public int insertSelective(FriendlyLink record){
        return friendlyLinkMapper.insertSelective(record);
    }

    public int deleteByPrimaryKey(Integer id){
        return friendlyLinkMapper.deleteByPrimaryKey(id);
    }

    public List<FriendlyLink> selectByExample(Integer start,Integer limit){
        start=(start-1)*limit;
        return friendlyLinkMapper.selectByExample(start,limit);
    }

    public int updateByPrimaryKeySelective(FriendlyLink record){
        return friendlyLinkMapper.updateByPrimaryKeySelective(record);
    }


    public FriendlyLink selectByPrimaryKey(Integer id){
        return friendlyLinkMapper.selectByPrimaryKey(id);
    }
}
