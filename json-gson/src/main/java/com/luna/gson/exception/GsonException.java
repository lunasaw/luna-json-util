package com.luna.gson.exception;

import exception.FormativeException;
import lombok.Getter;
import lombok.Setter;

/**
 * @author czy1024
 * 2019/4/10 22:35
 */
@Setter
@Getter
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
