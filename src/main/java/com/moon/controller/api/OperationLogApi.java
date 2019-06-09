package com.moon.controller.api;

import com.moon.pojo.OperationLog;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IOperationLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class OperationLogApi {

    private final IOperationLogService logService;

    @Autowired
    public OperationLogApi(IOperationLogService logService) {
        this.logService = logService;
    }

    @GetMapping("/operation/list")
    public Map selectByWeaveConstruction(String title,int page, int limit){
        log.info("title:{}",title);

        if(StringUtils.isEmpty(title)){
            title = null;
        }

        List<OperationLog> operationLogs = logService.selectAll(title,page,limit);
        Map<String,Object> map = new HashMap<>();

        map.put("code","0");
        map.put("msg","SUCCESS");
        map.put("data", operationLogs);
        if(title == null){
            map.put("count",logService.selectCount());
        }else {
            map.put("count",operationLogs.size());
        }

        log.info("operationLogs {}",logService.selectCount());
        return map;
    }
}
