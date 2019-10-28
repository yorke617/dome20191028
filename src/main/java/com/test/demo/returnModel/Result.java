package com.test.demo.returnModel;

public class Result<T> {

    private boolean success;
    private String msg;
    private T data;

    public Result(boolean success, T data){
        this.success = success;
        this.data = data;
    }

    public Result(boolean success, String msg){
        this.success = success;
        this.msg = msg;
    }


    public static Result success(){
        return new Result(true, null);
    }
    public static Result failed(String msg){
        return new Result(false, msg);
    }
    public static Result success(Object data){
        return new Result(true, data);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
