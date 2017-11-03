package com.simple.service;

import com.simple.dto.Exposer;
import com.simple.dto.SeckillExecution;
import com.simple.entity.Seckill;
import com.simple.exception.RepeatKillException;
import com.simple.exception.SeckillCloseException;
import com.simple.exception.SeckillException;

import java.util.List;

/**
 * Create by S I M P L E on 2017/11/03
 */
public interface SeckillService {

    /**
     * 查询所有的记录
     *
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个记录
     *
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 输出秒杀地址
     *
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀
     *
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;


}
