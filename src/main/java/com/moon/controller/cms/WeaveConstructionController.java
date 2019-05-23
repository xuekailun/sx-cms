package com.moon.controller.cms;

import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/***
 * 组织架构
 */
@Controller
@RequestMapping("column/")
@Slf4j
public class WeaveConstructionController {

    @Autowired
    private IWeaveConstructionService iWeaveConstructionService;

    @GetMapping("demo")
    public String demo() {
        return "hello word!";
    }


    /**
     * 查询出所有的部门架构
     * @return
     */
    @GetMapping("/list")
    public String list(Model model) {

        /* 获取树*/
        List list = iWeaveConstructionService.getColumns();
        model.addAttribute("columnList",list);

        return "cms/column/mailbox";
    }

    /***
     * 添加栏目页面
     * @return
     */
    @GetMapping("/add")
    public String addColumn(){
        return "cms/column/insert";
    }

}


