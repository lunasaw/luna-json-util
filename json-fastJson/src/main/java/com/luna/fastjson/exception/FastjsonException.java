package com.luna.fastjson.exception;

import exception.FormativeException;

/**
 * @author czy1024
 * 2019/4/10 22:35
 */
public class FastjsonException extends FormativeException {
    public FastjsonException() {
        super();
    }

    public FastjsonException(String message) {
        super(message);
    }

    public FastjsonException(Throwable cause) {
        super(cause);
    }

    public FastjsonException(String format, Object... arguments) {
        super(format, arguments);
    }
}
