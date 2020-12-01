package com.atguigu.springcloud.entities.seata.enums;

/**
 * @Author: wujing
 * @Description: 订单状态类型
 * @Date: 2020/12/1 10:25
 * @Version: 1.0
 */
public enum OrderState {

    NORMAL("01", "创建中"),
    CLOSED("02", "已完成");

    private String code;
    private String description;

    OrderState(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static OrderState getByCode(String code){
        OrderState[] accountBillStates = values();
        for(OrderState accountBillState : accountBillStates){
            if(accountBillState.getCode().equals(code)){
                return accountBillState;
            }
        }
        throw new IllegalArgumentException("未知的账单状态：" + code);
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
