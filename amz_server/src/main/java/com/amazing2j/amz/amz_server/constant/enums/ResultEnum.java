package com.amazing2j.amz.amz_server.constant.enums;

public enum ResultEnum {
    SUCCESS(200, "success"),
    FAIL(5000, "failed"),
    ERROR(6000, "ERROR"),
    ;


    public int code;
    public String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
