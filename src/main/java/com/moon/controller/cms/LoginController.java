package com.moon.controller.cms;

import com.moon.pojo.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "/cms/login";
    }


    @GetMapping("cms/xgmm")
    public String xgmm(Model model, HttpSession session){

//        LoginUser userInfo = (LoginUser) session.getAttribute("userInfo");

        LoginUser userInfo = new LoginUser();
        userInfo.setPassword("123");

        model.addAttribute("userInfo",userInfo);

        return "cms/user/xgmm";
    }
}
