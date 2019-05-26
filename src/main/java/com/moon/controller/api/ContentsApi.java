package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IContentsService;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("contents/")
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
        List<Contents> contents =  iContentsService.selectContentBy();
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","操作成功");
        map.put("data", contents);
        map.put("count", contents.size());
        return map;
    }


}

@Data
class Demo{
    private Integer id;
    private String name;
    private String sex;
}
