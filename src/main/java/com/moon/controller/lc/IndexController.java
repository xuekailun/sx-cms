package com.moon.controller.lc;

import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    private final IWeaveConstructionService iWeaveConstructionService;

    @Autowired
    public IndexController(IWeaveConstructionService iWeaveConstructionService) {
        this.iWeaveConstructionService = iWeaveConstructionService;
    }

    /***
     * 乐才的首页
     * @return
     */
    @GetMapping("/index")
    public String index(Model model){
        //导航栏展示
        List<WeaveConstruction> navs =  iWeaveConstructionService.selectByIsShow("1",null);
        model.addAttribute("nav",navs);
        //查询 导航栏显示为1的
        return "lc/index";
    }


    @GetMapping("/demoone")
    public String demo(Model model){
        String url = "/OTA/123.png";
        model.addAttribute("demoone",url);
        return "lc/demo";
    }
}
