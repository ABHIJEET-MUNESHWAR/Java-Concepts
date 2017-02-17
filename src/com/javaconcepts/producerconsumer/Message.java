package com.javaconcepts.producerconsumer;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 14/02/17
 * Time: 12:01 PM
 */
public class Message {
    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
