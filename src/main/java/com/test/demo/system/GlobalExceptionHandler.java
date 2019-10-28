package com.test.demo.system;

import com.test.demo.returnModel.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Result setErrorToClient(BusinessException e) {
        return Result.failed(e.getErrorMsg());
    }
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        e.printStackTrace();
        return Result.failed(e.getMessage());
    }
}
