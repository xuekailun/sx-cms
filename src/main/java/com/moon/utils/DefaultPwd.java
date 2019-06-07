package com.moon.utils;

/***
 * 默认使用加密
 */
public class DefaultPwd {

    private static final String key ="sx_CS";
    private  CryptoUtil util = new CryptoUtil();
    /* 加密 */
    public String encrypt(String value){
        return util.encode(key,value);
    }

    /* 解密 */
    public String decode(String value){
        return util.decode(key,value);
    }

    public static void main(String[] args) {
        System.out.println( new DefaultPwd().encrypt("admin"));
        System.out.println("==============");
        System.out.println( new DefaultPwd().decode("be3u_bDLPjc"));
    }
}
