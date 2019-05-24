package com.moon.controller.api;

import com.moon.service.IContentsService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ContentsApi {

    private final IContentsService iContentsService;

    @Autowired
    public ContentsApi(IContentsService iContentsService) {
        this.iContentsService = iContentsService;
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
        map.put("data", demos);
        map.put("count", "3");
        return map;
    }
}

@Data
class Demo{
    private Integer id;
    private String name;
    private String sex;
}
