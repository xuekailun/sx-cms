package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.LoginUser;
import com.moon.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginApi {


    private final ILoginUserService loginUserService;

    @Autowired
    public LoginApi(ILoginUserService loginUserService) {
        this.loginUserService = loginUserService;
    }

    @PostMapping("/cms/login")
    public ServerResponse login(@RequestBody LoginUser loginUser, HttpSession session){

        String username = loginUser.getUsername();
        String password = loginUser.getPassword();

        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            return ServerResponse.createByErrorMessage("用户名和密码为空");
        }

        LoginUser user = loginUserService.selectByLoginUser(username,password);
        if(user == null){
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }
        //TODO  后期要加入 授权码的验证

        session.setAttribute("userInfo",user);
        return ServerResponse.createBySuccess("登陆成功",user);
    }

    @PostMapping("/cms/xgmmSave")
    public ServerResponse xgmmSave(@RequestBody LoginUser loginUser){

        return null;
    }
}
