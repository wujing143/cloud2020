package com.atguigu.springcloud.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @ClassName: StorageDao
 * @Author: Wu
 * @Date: 2020/11/23 21:51
 */
public interface StorageDao {

    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
