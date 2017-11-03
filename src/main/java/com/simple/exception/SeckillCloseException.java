package com.simple.exception;

/**
 * 秒杀关闭异常
 * Create by S I M P L E on 2017/11/03
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
