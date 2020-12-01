package com.atguigu.springcloud.entities.common;

/**
 * @author WangYuBing
 * @version V1.0
 * @Package com.io.icos.entity.enums
 * @date 2020/6/23 11:04
 */
public enum ResSuccess {
    SYS_200("200", "操作成功");

    private String code;
    private String message;

    ResSuccess(String code, String message) {
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
