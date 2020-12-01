package com.atguigu.springcloud.entities.common;


import lombok.Data;

/**
 * 公司 返回前端类类型
 * @param <T>
 */
@Data
public class JSONResponse<T> {

	private boolean success;
    private String message;
    private String errorDescription;
    private T data;
    private String code;
}
