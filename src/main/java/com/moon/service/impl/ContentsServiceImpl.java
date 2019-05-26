package com.moon.service.impl;

import com.moon.dao.ContentsMapper;
import com.moon.dao.WeaveConstructionMapper;
import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IContentsService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContentsServiceImpl implements IContentsService {

    private final ContentsMapper contentsMapper;
    private final WeaveConstructionMapper weaveConstructionMapper;

    @Autowired
    public ContentsServiceImpl(ContentsMapper contentsMapper, WeaveConstructionMapper weaveConstructionMapper) {
        this.contentsMapper = contentsMapper;
        this.weaveConstructionMapper = weaveConstructionMapper;
    }

    public List<Contents> selectContentBy(){
        return contentsMapper.selectContentBy();
    }

    public Integer deleteByPrimaryKey(Integer id){
        return contentsMapper.deleteByPrimaryKey(id);
    }

    public Contents selectByPrimaryKey(Integer id){
        return contentsMapper.selectByPrimaryKey(id);
    }

    public List getColumns(){
        List<WeaveConstruction> constructions = weaveConstructionMapper.selectByPid(0);
        Integer id = null;
        String name = null;
        Integer pid = null;
        Integer gid = null;
        String gname = null;
        Integer gpid = null;
        List<Column> allList = null;

        List<Object> list = new ArrayList<>();
        for (WeaveConstruction obj : constructions) {
            id = obj.getwId();
            name = obj.getwName();
            pid = obj.getwPid();
            Column column = new Column();
            column.setId(id);
            column.setPId(pid);
            column.setName(name);

            //显示添加的页面
            column.setUrl("/cms/contents/add?id="+id);
            list.add(column);
            List<WeaveConstruction> weaveConstructionList = weaveConstructionMapper.selectAll();
            for(WeaveConstruction ction : weaveConstructionList){
                allList = new ArrayList<>();
                gid = ction.getwId();
                gname = ction.getwName();
                gpid = ction.getwPid();
                //     if(id == gpid){
                column = new Column();
                column.setId(gid);
                column.setPId(gpid);
                column.setName(gname);
                //显示添加的页面
                column.setUrl("/cms/contents/add?id="+gid);
                list.add(column);
                //     }

            }
        }

        return list;
    }

    public int insertSelective(Contents record){
        return contentsMapper.insertSelective(record);
    }
}
