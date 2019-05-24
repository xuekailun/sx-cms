package com.moon.commons;

/**
 * Created by Thinkpad on 2017-09-05.
 */
public enum ResponseCode {

    SUCCESS(200,"SUCCESS"),
    ERROR(100,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
