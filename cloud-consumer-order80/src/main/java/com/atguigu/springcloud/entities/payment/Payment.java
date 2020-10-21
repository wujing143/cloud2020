package com.atguigu.springcloud.entities.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: Payment
 * @Author: wujing
 * @Description: 支付实体类
 * @Date: 2020/10/20 14:02
 * @Version: 1.0
 */

/**
 * Serializable   序列化 ，以后分布式部署可能用得到
 */
@Data
@AllArgsConstructor   //全参
@NoArgsConstructor    //空参
//@Api("参数类")
public class Payment implements Serializable {

//    @ApiModelProperty("id")
    private Long id;
//    @ApiModelProperty("序号")
    private String serial;

}
