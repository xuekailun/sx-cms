package com.moon.pojo;

public class LoginUser {
    private Integer id;

    private String username;

    private String password;

    private Integer phone;

    private Integer usableness;

    private String imgsrc;

    private String loginname;

    private String unlockingkey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getUsableness() {
        return usableness;
    }

    public void setUsableness(Integer usableness) {
        this.usableness = usableness;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getUnlockingkey() {
        return unlockingkey;
    }

    public void setUnlockingkey(String unlockingkey) {
        this.unlockingkey = unlockingkey == null ? null : unlockingkey.trim();
    }
}