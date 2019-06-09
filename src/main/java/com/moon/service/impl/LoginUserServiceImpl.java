package com.moon.service.impl;

import com.moon.dao.LoginUserMapper;
import com.moon.pojo.LoginUser;
import com.moon.service.ILoginUserService;
import com.moon.utils.DefaultPwd;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUserServiceImpl implements ILoginUserService {

    private final LoginUserMapper loginUserMapper;

    @Autowired
    public LoginUserServiceImpl(LoginUserMapper loginUserMapper) {
        this.loginUserMapper = loginUserMapper;
    }



    public LoginUser selectByLoginUser(String username, String password){
        // 先进行加密
        password = encryptPwd(password);
        LoginUser user = loginUserMapper.selectByLoginUser(username, password);
        if(user == null){
            return null;
        }
        user.setPassword("");
        return user;
    }


    private String encryptPwd(String password){
        DefaultPwd pwd = new DefaultPwd();
        return pwd.encrypt(password);
    }

//    public int xgmmSave(String username, String password)

}
