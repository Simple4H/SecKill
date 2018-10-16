drop database db_seckill;
CREATE DATABASE db_seckill;

-- 创建数据库
USE db_seckill;

-- 创建表
CREATE TABLE seckill (
  `seckill_id`  BIGINT       NOT NULL AUTO_INCREMENT
  COMMENT '商品库存id',
  `name`        VARCHAR(120) NOT NULL
  COMMENT '商品名称',
  `number`      INT          NOT NULL
  COMMENT '库存数量',
  `start_time`  datetime    NOT NULL
  COMMENT '秒杀开始时间',
  `end_time`   datetime    NOT NULL
  COMMENT '秒杀结束时间',
  `create_time` TIMESTAMP    NOT NULL DEFAULT current_timestamp
  COMMENT '创建时间',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)

)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8
  COMMENT '秒杀库存表';

-- 初始化数据

INSERT INTO seckill (NAME, NUMBER, start_time, end_time
) VALUES
  ('抢1元红包', 1, '2018-11-02 00:00:00', '2018-11-03 00:00:00'),
  ('抢10元红包', 10, '2018-11-02 00:00:00', '2018-11-03 00:00:00'),
  ('抢100元红包', 100, '2018-11-02 00:00:00', '2018-11-03 00:00:00'),
  ('抢1000元红包', 1000, '2018-11-02 00:00:00', '2018-11-03 00:00:00');

-- 秒杀成功表
-- 用户登陆认证有有关的信息

CREATE TABLE success_killed (
  `seckill_id`  BIGINT    NOT NULL
  COMMENT '秒杀商品id',
  `user_phone`  BIGINT    NOT NULL
  COMMENT '用户手机号',
  `state`       TINYINT   NOT NULL DEFAULT -1
  COMMENT '状态提示:-1:无效, 0:成功 1:已付款 2:已发货',
  `create_time` datetime NOT NULL
  COMMENT '创建时间',
  PRIMARY KEY (seckill_id, user_phone), /*联合主键*/
  key idx_create_time(create_time)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COMMENT '秒杀库存表';