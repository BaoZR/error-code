package com.bob.config;/**
 * @Author:bob
 * @DATE:2024/4/20 22:26
 * @Description:
 */

import com.bob.enums.ErrorCode;

/**
 * @author: bob
 * @date: 2024/4/20 22:26
 * @description: TODO
 */
public class CustomException extends RuntimeException{
    private String code;
    private String message;

    public CustomException(String code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public CustomException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public CustomException(){}


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
