package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class WeaveConstructionAPi {

    private final IWeaveConstructionService iWeaveConstructionService;

    @Autowired
    public WeaveConstructionAPi(IWeaveConstructionService iWeaveConstructionService) {
        this.iWeaveConstructionService = iWeaveConstructionService;
    }


    @GetMapping("/column/list/v1")
    public Map selectByWeaveConstruction(String id,int page, int limit){

        List<WeaveConstruction> columns = null;
        Map<String,Object> map = new HashMap<>();
//        columns =  iWeaveConstructionService.selectAll(curr,limit);

//        if(StringUtils.isEmpty(id) || id.equals("null")){
//            columns = iWeaveConstructionService.selectAll();
//        }else{
            columns = iWeaveConstructionService.selectPidByCaseWhen(Integer.parseInt(id),page,limit);
//        }
        map.put("code","0");
        map.put("msg","SUCCESS");
        map.put("data", columns);
        map.put("count", 12);
        log.info("columns {}",columns);
        return map;
    }

    @PostMapping("column/increases")
    public ServerResponse insert(@RequestBody WeaveConstruction reqBody){
        log.info("reqBody {}",reqBody);
        int inserCount = iWeaveConstructionService.insertWeaveConstruction(reqBody);
        if(inserCount > 0){
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }

    @GetMapping("column/delete")
    public ServerResponse delete(Integer id){
        int deleteCount = iWeaveConstructionService.deleteByPrimaryKey(id);
        if(deleteCount > 0){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    @PostMapping("column/modification")
    public ServerResponse update(@RequestBody WeaveConstruction reqBody){
        int updateCount = iWeaveConstructionService.updateByPrimaryKeySelective(reqBody);
        if(updateCount > 0){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }
}
