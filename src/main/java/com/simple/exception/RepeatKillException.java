package com.simple.exception;

/**
 * 重复秒杀异常
 * Create by S I M P L E on 2017/11/03
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
