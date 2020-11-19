package com.atguigu.springcloud.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wujing
 * @version V1.0
 * @Package com.atguigu.springcloud.entities.common
 * @date 2020/10/20 11:04
 */
@Data
@AllArgsConstructor   //全参构造
@NoArgsConstructor    //无参构造
public class CommonResult<T> {


    private String code;
    private String message;
    private T data;


    public CommonResult(String code, String message) {
       this (code,message,null);
    }



}
