package com.moon.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 后台登陆的主页
 */
@Controller
public class HomeController {

    /***
     * 登陆进来的时候显示的主页
     * @return
     */
    @GetMapping("index")
    public String index(){
        System.out.println();
        return "cms/index";
    }

    /***
     * 登陆进来显示的weilcome页面
     * @return
     */
    @GetMapping("welcome")
    public String welcom(){
        return "cms/index_v1";
    }
}
