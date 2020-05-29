package com.zdp.common;

/**
 * @author sesshomaru
 * @date 2020/2/4 9:53
 *
 * 响应枚举
 */
public enum CodeEnum {

    SUCCESS(200, "SUCCESS"),
    NOT_LOGIN(10001, "未登录"),
    ACCOUNT_NOT_EXIST(10002, "账户不存在"),
    PASSWORD_ERROR(10003, "密码错误"),
    ACCOUNT_DELETED(10004, "账户已被删除"),
    NOT_ALLOW(10005, "无权限访问"),
    PARAMETER_IS_NULL(10006,"参数为空"),
    IS_COLLECT(1007,"已收藏"),
    SHARE_CONTENT_ERROR(500,"分享内容有误"),
    SHARE_IMAGE_ERROR(500,"分享图片有误"),
    UPLOAD_IMAGE_ERROR(500,"图片上传失败"),
    UPLOAD_CONTENT_ERROR(500,"文字上传失败"),
    UPLOAD_RE_ERROR(500,"资源上传失败"),


    FAIL(500, "网络异常");

    private int code;

    private String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
