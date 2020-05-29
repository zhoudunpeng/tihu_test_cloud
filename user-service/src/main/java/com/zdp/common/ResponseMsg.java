package com.zdp.common;


/**
 * @author sesshomaru
 * @date 2020/2/4 9:54
 *
 *  接口返回对象
 */
public class ResponseMsg<T> {
    private int code;

    private T data;

    private String msg;

    private ResponseMsg() {
        this.code = CodeEnum.SUCCESS.getCode();
        this.msg = CodeEnum.SUCCESS.getMsg();
    }

    private ResponseMsg(T data) {
        this.data = data;
        this.code = CodeEnum.SUCCESS.getCode();
        this.msg = CodeEnum.SUCCESS.getMsg();
    }

    private ResponseMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResponseMsg(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <T> ResponseMsg<T> success(T data) {
        return new ResponseMsg<>(CodeEnum.SUCCESS.getCode(), data, CodeEnum.SUCCESS.getMsg());
    }


    public static <T> ResponseMsg<T> fail(int code, String msg) {
        return new ResponseMsg<>(code, msg);
    }

    public static <T> ResponseMsg<T> fail(CodeEnum codeEnum) {
        return new ResponseMsg<>(codeEnum.getCode(), codeEnum.getMsg());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
