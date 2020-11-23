package com.atguigu.springcloud.entities.seata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: SeaTac分布式事务库存类
 * @ClassName: Storage
 * @Author: Wu
 * @Date: 2020/11/23 20:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}
