package com.atguigu.crowd.exception;

/**
 * 表示用于没有登录就访问受保护资源时抛出的异常
 * @author zehao
 * @create 2021-11-08-15:24
 */
public class AccessForbiddenException extends RuntimeException{

    public AccessForbiddenException() {
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    public AccessForbiddenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}