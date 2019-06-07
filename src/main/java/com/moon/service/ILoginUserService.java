package com.moon.service;

import com.moon.pojo.LoginUser;

public interface ILoginUserService {

    /***
     * 登陆的时候先进行验证
     * @param username
     * @param password
     * @return
     */
    LoginUser selectByLoginUser(String username, String password);
}
