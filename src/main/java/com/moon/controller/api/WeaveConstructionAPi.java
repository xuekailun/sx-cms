package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.OperationLog;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.ILoginUserService;
import com.moon.service.IOperationLogService;
import com.moon.service.IWeaveConstructionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class WeaveConstructionAPi {

    private final IWeaveConstructionService iWeaveConstructionService;

    private final IOperationLogService logService;

    @Autowired
    public WeaveConstructionAPi(IWeaveConstructionService iWeaveConstructionService, IOperationLogService logService) {
        this.iWeaveConstructionService = iWeaveConstructionService;
        this.logService = logService;
    }

    @GetMapping("/column/list/v1")
    public Map selectByWeaveConstruction(Integer id,int page, int limit){

        List<WeaveConstruction> columns = null;
        Map<String,Object> map = new HashMap<>();
        if(id == 0){
            id = null;
        }
        columns = iWeaveConstructionService.selectPidByCaseWhen(id,page,limit);
        map.put("code","0");
        map.put("msg","SUCCESS");
        map.put("data", columns);
        map.put("count", iWeaveConstructionService.selectCount());
        log.info("columns {}",iWeaveConstructionService.selectCount());
        return map;
    }

    @PostMapping("column/increases")
    public ServerResponse insert(@RequestBody WeaveConstruction reqBody){
        log.info("reqBody {}",reqBody);
        int inserCount = iWeaveConstructionService.insertWeaveConstruction(reqBody);
        if(inserCount > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("增加栏目");
            obj.setContent("name="+reqBody.getwName());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }

    @GetMapping("column/delete")
    public ServerResponse delete(Integer id){
        int deleteCount = iWeaveConstructionService.deleteByPrimaryKey(id);
        if(deleteCount > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("删除栏目");
            obj.setContent("id="+id);
            logService.insertSelective(obj);
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
