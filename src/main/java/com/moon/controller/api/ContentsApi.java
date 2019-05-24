package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IContentsService;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class ContentsApi {

    private final IContentsService iContentsService;

    private final IWeaveConstructionService iWeaveConstructionService;

    @Autowired
    public ContentsApi(IContentsService iContentsService, IWeaveConstructionService iWeaveConstructionService) {
        this.iContentsService = iContentsService;
        this.iWeaveConstructionService = iWeaveConstructionService;
    }

    @GetMapping("list")
    public Map list(){
        List<Demo> demos = new ArrayList<>();
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("张三");
        demo.setSex("男");
        demos.add(demo);
        Demo demo1 = new Demo();
        demo1.setId(3);
        demo1.setName("张三1");
        demo1.setSex("男1");
        demos.add(demo1);
        Demo demo2 = new Demo();
        demo2.setId(2);
        demo2.setName("张三2");
        demo2.setSex("男2");
        demos.add(demo2);
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","操作成功");
        map.put("data", iContentsService.selectContentBy());
//        map.put("count", "3");
        return map;
    }

    @PostMapping("column/increases")
    public ServerResponse insert(@RequestBody WeaveConstruction reqBody){
        log.info("reqBody {}",reqBody);
        int inserCount = iWeaveConstructionService.insertSelective(reqBody);
        if(inserCount > 0){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }
}

@Data
class Demo{
    private Integer id;
    private String name;
    private String sex;
}
