package com.simple.dao;

import com.simple.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * Create by S I M P L E on 2017/11/02
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
