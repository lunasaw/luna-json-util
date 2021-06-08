package com.luna.gson.exception;

import exception.FormativeException;


/**
 * @author lunasaw
 * 2019/4/10 22:35
 */
public class GsonException extends FormativeException {
    public GsonException() {
        super();
    }

    public GsonException(String message) {
        super(message);
    }

    public GsonException(Throwable cause) {
        super(cause);
    }

    public GsonException(String format, Object... arguments) {
        super(format, arguments);
    }
}
