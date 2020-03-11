package com.seari.demo.factory.demo01;

/**
 * 多个方法工厂模式 避免了传递字符串出错的问题
 */
public class SendFactory2 {
    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SendFactory2 sendFactory = new SendFactory2();
        sendFactory.produceMail().Send();
    }
}
