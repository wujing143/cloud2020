package com.atguigu.springcloud.service;

/**
 * @Description:
 * @ClassName: StorageService
 * @Author: Wu
 * @Date: 2020/11/23 21:52
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
