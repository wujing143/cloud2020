package com.atguigu.springcloud.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Description:
 * @ClassName: accountDao
 * @Author: Wu
 * @Date: 2020/11/23 21:50
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
