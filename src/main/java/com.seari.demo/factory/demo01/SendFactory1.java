package com.seari.demo.factory.demo01;

/**
 * 简单工厂模式
 */
public class SendFactory1 {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }
    }

    public static void main(String[] args) {
        SendFactory1 sendFactory = new SendFactory1();
        Sender sms = sendFactory.produce("sms");
        sms.Send();
    }
}
