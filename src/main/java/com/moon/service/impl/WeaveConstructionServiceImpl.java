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

    public int updateByPrimaryKeySelective(WeaveConstruction record){
        return weaveConstructionMapper.updateByPrimaryKeySelective(record);
    }

    public int insertSelective(WeaveConstruction record){
        return weaveConstructionMapper.insertSelective(record);
    }

    public int insertWeaveConstruction(WeaveConstruction record){
        return weaveConstructionMapper.insertWeaveConstruction(record);
    }


    /* 查询栏目除跟目录 */
    public List<WeaveConstruction> selectAll(){
        return weaveConstructionMapper.selectAllByCaseWhen();
    }



    public List<WeaveConstruction> selectByPid(Integer pid){
        return weaveConstructionMapper.selectByPid(pid);
    }

    /***
     * 通过id 去查询栏目名称
     * @param Id
     * @return
     */
    public WeaveConstruction selectById(Integer Id){
        List<WeaveConstruction> constructions =  weaveConstructionMapper.selectById(Id);
        if(constructions.size() > 0 ) {
            return constructions.get(0);
        }
        return new WeaveConstruction();
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
            column.setUrl("/cms/column/add?id="+id);
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
                    column.setUrl("/cms/column/add?id="+gid);
                    list.add(column);
           //     }

            }
        }

        return list;
    }

    public List<WeaveConstruction> selectByIsShow(String isShow,String isList){
        return weaveConstructionMapper.selectByIsShow(isShow, isList);
    }

    public Integer deleteByPrimaryKey(Integer wId){
        return weaveConstructionMapper.deleteByPrimaryKey(wId);
    }
}

@Data
class Column{

    private Integer id;
    private Integer pId;
    private String name;
    private String url;
    private String target = "_self";
    private String open = "true";

    public Integer getpId() {
        return pId;
    }
}