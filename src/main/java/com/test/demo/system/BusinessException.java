package com.test.demo.system;

public class BusinessException extends RuntimeException {

    private String errorMsg;

    public BusinessException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
