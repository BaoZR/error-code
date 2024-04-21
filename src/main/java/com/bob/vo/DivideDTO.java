package com.bob.vo;/**
 * @Author:bob
 * @DATE:2024/4/20 23:58
 * @Description:
 */

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * @author: bob
 * @date: 2024/4/20 23:58
 * @description: TODO
 */

public class DivideDTO {
    @NotNull(message = "a不得为空")
    private int a;
    @NotNull(message = "b不能为空")
    @Min(value = 0)
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public DivideDTO() {
    }

    public DivideDTO(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
