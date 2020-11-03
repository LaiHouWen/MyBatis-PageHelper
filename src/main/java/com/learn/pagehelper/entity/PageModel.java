package com.learn.pagehelper.entity;

import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@ToString
public class PageModel<T> {
    private Integer code;
    private String message;
    private String timeStamp;
    private T data;

    public PageModel() {
    }

    public PageModel(Integer code, String message, String timeStamp, T data) {
        this.code = code;
        this.message = message;
        this.timeStamp = timeStamp;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", data=" + data +
                '}';
    }
}
