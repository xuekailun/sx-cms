package com.moon.commons;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by geely
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
//保证序列化json的时候,如果是null的对象,key也会消失
public class ServerResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;
    private Object object;

    private ServerResponse(int status){
        this.status = status;
    }
    private ServerResponse(int status,T data){
        this.status = status;
        this.data = data;
    }

    private ServerResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    private ServerResponse(int status,String msg,T data,Object object){
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.object = object;
    }

    private ServerResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }



    @JsonIgnore
    //使之不在json序列化结果当中
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }
    public Object getobject(){return object;}


    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    /*普通验证成功的使用*/
    public static <T> ServerResponse<T> createBySuccessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    //添加
    public static <T> ServerResponse<T> createBySuccessMessage(int status,String msg){
        return new ServerResponse<T>(status,msg);
    }
    //添加
    public static <T> ServerResponse<T> createByErrorMessage(int status,String msg){
        return new ServerResponse<T>(status,msg);
    }




    public static <T> ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }


    //添加
    public static <T> ServerResponse<T> createBySuccess(int status,String msg,T data){
        return new ServerResponse<T>(status,msg,data);
    }

    public static <T> ServerResponse<T> createBySuccess(int status,String msg,T data,Object object){
        return new ServerResponse<T>(status,msg,data,object);
    }

    public static <T> ServerResponse<T> createBySuccessN(int code,String msg,T data,Object object){
        return new ServerResponse<T>(code,msg,data,object);
    }


    public static <T> ServerResponse<T> createBySuccess(String msg, T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> ServerResponse<T> createByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }


    public static <T> ServerResponse<T> createByErrorMessage(String errorMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new ServerResponse<T>(errorCode,errorMessage);
    }













}
