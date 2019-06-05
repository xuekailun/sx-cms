package com.moon.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CommonController {

    //日志跳转界面显示
    @GetMapping("/cms/operation/{path}")
    public String logList(@PathVariable("path") String path){
        return "cms/operation/"+path;
    }
}
