package com.simple.dao;

import com.simple.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * spring和junit4的整合,junit启动时加载SpringIoC容器
 * Create by S I M P L E on 2017/11/02
 */
@RunWith(SpringJUnit4ClassRunner.class)
//spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SecckillDaoTest {

    @Resource
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println(updateCount);
    }

    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckillList = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckillList) {
            System.out.println(seckill);
        }
    }
}