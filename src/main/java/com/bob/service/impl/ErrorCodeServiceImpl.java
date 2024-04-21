package com.bob.service.impl;/**
 * @Author:bob
 * @DATE:2024/4/20 21:24
 * @Description:
 */

import com.bob.common.Result;
import com.bob.config.CustomException;
import com.bob.enums.ErrorCode;
import com.bob.service.ErrorCodeService;
import com.bob.vo.DivideDTO;
import org.springframework.stereotype.Service;

/**
 * @author: bob
 * @date: 2024/4/20 21:24
 * @description: TODO
 */
@Service
public class ErrorCodeServiceImpl implements ErrorCodeService {

    @Override
    public Result test_success() {
        return new Result<>(ErrorCode.SUCCESS);
    }

    @Override
    public Result test_failed() {
        throw new CustomException(ErrorCode.CLIENT_ERROR);
    }

    @Override
    public Result divide(DivideDTO divideDTO) {
        int c = divideDTO.getA()/ divideDTO.getB();
        return new Result(ErrorCode.SUCCESS).setData(c);
    }


}
