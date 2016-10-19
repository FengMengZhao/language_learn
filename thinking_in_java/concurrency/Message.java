package org.fmz.concurrency;

public class Message{
    private String msg;

    public Message(String str){
        msg = str;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String str){
        msg = str;
    }
}
