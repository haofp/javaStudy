package com.seari.demo.factory.demo01;

/**
 * 多个静态方法，不需要创建实例，直接调用即可
 */
public class SendFactory3 {

    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args) {
        SendFactory3 sendFactory = new SendFactory3();
        sendFactory.produceMail();
    }
}
