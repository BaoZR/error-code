package com.bob.enums;/**
 * @Author:bob
 * @DATE:2024/4/20 21:09
 * @Description:
 */

/**
 * @author: bob
 * @date: 2024/4/20 21:09
 * @description: TODO
 */
public enum ErrorCode {
    SUCCESS("00000","操作成功"),
    CLIENT_ERROR("A0001","客户端错误"),
    REQUEST_PARAMETER_ERROR("A0400","用户请求参数错误"),
    SYSTEM_ERROR("B0001","系统错误");

    private String code;
    private String message;

    ErrorCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
