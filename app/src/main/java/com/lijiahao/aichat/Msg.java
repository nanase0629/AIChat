package com.lijiahao.aichat;


public class Msg {

    public static final int MSG_RECEIVED = 0; //接收到信息

    public static final int MSG_SEND =1 ; //发送信息

    private String content; // 存储消息内容
    private int type; // 存储消息类型

    public Msg(String content,int type){
        this.content=content;
        this.type=type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}