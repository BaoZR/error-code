package com.bob.controller;/**
 * @Author:bob
 * @DATE:2024/4/20 21:02
 * @Description:
 */

import com.bob.common.Result;
import com.bob.enums.ErrorCode;
import com.bob.service.ErrorCodeService;
import com.bob.vo.DivideDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author: bob
 * @date: 2024/4/20 21:02
 * @description: TODO
 */
@RestController
public class ErrorCodeController {

    @Resource
    ErrorCodeService errorCodeService;

    @GetMapping("/test_success")
    public Result test_success(){
        return errorCodeService.test_success();
    }

    @GetMapping("/test_failed")
    public Result test_failed(){
        return errorCodeService.test_failed();
    }

    @GetMapping("/divide")
    public Result divide(@RequestBody @Valid DivideDTO divideDTO){
        return errorCodeService.divide(divideDTO);
    }


}
