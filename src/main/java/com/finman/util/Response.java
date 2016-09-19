package com.finman.util;

/**
 * Return Response Object
 * 
 * @author Superuser
 * @param <T>
 *
 */
public class Response<T> {

    /**
     * Status Message
     */
    private String status;

    /**
     * The Status Code
     */
    private int code;
    /**
     * The Data
     */
    private T data;

    public Response(String status, int code, T data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public static<T> Response<T> success(T data) {
        return new Response<>("Success", 200, data);
    }

    public Response<T> success(String status, T data) {
        return new Response<>(status, 200, data);
    }

    public Response<T> success(String status, int code, T data) {
        return new Response<>(status, code, data);
    }

    public static<T> Response<T> failure(String status) {
        return new Response<>(status, 500, null);
    }

    public static<T> Response<T> failure(int code) {
        return new Response<>("Internal Error", code, null);
    }
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
