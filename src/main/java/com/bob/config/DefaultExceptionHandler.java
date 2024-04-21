package com.bob.config;/**
 * @Author:bob
 * @DATE:2024/4/20 22:25
 * @Description:
 */

import com.bob.common.Result;
import com.bob.enums.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: bob
 * @date: 2024/4/20 22:25
 * @description: TODO
 */
@RestControllerAdvice
public class DefaultExceptionHandler {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(CustomException.class)
    public Result customExceptionHandler(CustomException e){
        Result result = new Result();
        result.setCode(e.getCode());
        result.setMessage(e.getMessage());
        return  result;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleValidationExceptions(MethodArgumentNotValidException ex) {
        logger.error("[handleValidationExceptions]", ex);
        StringBuilder sb = new StringBuilder();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((org.springframework.validation.FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            sb.append(fieldName).append(":").append(errorMessage).append(";");
        });
        return new Result(ErrorCode.REQUEST_PARAMETER_ERROR).setData(sb.toString());
    }



    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Throwable e){
        logger.error("系统异常：",e);
        return new Result<>(ErrorCode.SYSTEM_ERROR).setData(e.getMessage());
    }
}
