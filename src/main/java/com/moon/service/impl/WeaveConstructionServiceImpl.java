package com.moon.service.impl;

import com.moon.dao.WeaveConstructionMapper;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeaveConstructionServiceImpl implements IWeaveConstructionService {

    private final WeaveConstructionMapper weaveConstructionMapper;

    @Autowired
    public WeaveConstructionServiceImpl(WeaveConstructionMapper weaveConstructionMapper) {
        this.weaveConstructionMapper = weaveConstructionMapper;
    }


    /* 查询栏目除跟目录 */
    public List<WeaveConstruction> selectAll(){
        return weaveConstructionMapper.selectAll();
    }

    /**
     * 获取树
     * @return
     */
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
            column.setUrl("/column/add?id="+id);
            list.add(column);
            List<WeaveConstruction> weaveConstructionList = weaveConstructionMapper.selectByPid(id);
            for(WeaveConstruction ction : weaveConstructionList){
                allList = new ArrayList<>();
                gid = ction.getwId();
                gname = ction.getwName();
                gpid = ction.getwPid();
                if(id == gpid){
                    column = new Column();
                    column.setId(gid);
                    column.setPId(gpid);
                    column.setName(gname);
                    //显示添加的页面
                    column.setUrl("/column/add?id="+id);
                    list.add(column);
                }

            }
        }

        return list;
    }
}

@Data
class Column{

    private Integer id;
    private Integer pId;
    private String name;
    private String url;
    private String target = "_self";

    public Integer getpId() {
        return pId;
    }
}