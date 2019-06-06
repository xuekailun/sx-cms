package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.LoginUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {

    @PostMapping("/cms/login")
    public ServerResponse login(@RequestBody LoginUser loginUser){
        return  null;
    }
}
