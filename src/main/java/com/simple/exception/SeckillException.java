package com.simple.exception;

/**
 * 秒杀业务的异常
 * Create by S I M P L E on 2017/11/03
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
