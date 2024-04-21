package com.bob.common;/**
 * @Author:bob
 * @DATE:2024/4/20 20:29
 * @Description:
 */

import com.bob.enums.ErrorCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static com.bob.common.utils.getTime;

/**
 * @author: bob
 * @date: 2024/4/20 20:29
 * @description: TODO
 */
public class Result <T> implements java.io.Serializable{
    private String code;
    private String message;
    private T data;
    private String timestamp;

    public String getCode() {
        return code;
    }

    public Result<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Result setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Result(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.timestamp = getTime();
    }

    public Result() {
        this.timestamp = getTime();
    }

    public Result success() {
        return new Result(ErrorCode.SUCCESS);
    }

    public Result success(T data){
        return this.success().setData(data);
    }
}
