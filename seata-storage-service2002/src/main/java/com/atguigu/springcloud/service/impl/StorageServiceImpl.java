package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.mapper.StorageDao;
import com.atguigu.springcloud.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @ClassName: StorageServiceImpl
 * @Author: Wu
 * @Date: 2020/11/23 21:53
 */
@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger logger = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    // 扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        logger.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        logger.info("------->storage-service中扣减库存结束");
    }


}


