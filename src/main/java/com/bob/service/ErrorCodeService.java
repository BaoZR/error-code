package com.bob.service;/**
 * @Author:bob
 * @DATE:2024/4/20 21:23
 * @Description:
 */

import com.bob.common.Result;
import com.bob.vo.DivideDTO;

/**
 * @author: bob
 * @date: 2024/4/20 21:23
 * @description: TODO
 */
public interface ErrorCodeService {
    Result test_success();

    Result test_failed();

    Result  divide(DivideDTO divideDTO);
}
