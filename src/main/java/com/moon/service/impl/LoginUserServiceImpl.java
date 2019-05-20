package com.moon.service.impl;

import com.moon.dao.LoginUserMapper;
import com.moon.service.ILoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements ILoginUserService {

    private final LoginUserMapper loginUserMapper;

    @Autowired
    public LoginUserServiceImpl(LoginUserMapper loginUserMapper) {
        this.loginUserMapper = loginUserMapper;
    }
}