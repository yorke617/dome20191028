package com.test.demo.returnModel;

public class Result<T> {

    private boolean success;
    private String msg;
    private T data;

    public Result(boolean success, T data){
        success = this.success;
        this.data = data;
    }

    public Result(boolean success, String msg){
        success = this.success;
        this.msg = msg;
    }


    public static Result success(){
        return new Result(true, null);
    }
    public static Result failed(String msg){
        return new Result(false, msg);
    }
}
