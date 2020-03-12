package com.seari.demo.java.jdkproxy;

public class ProxyDemo {
    public static void main(String[] args) {
        IDog dog = new GunDog();
        IDog proxy = (IDog)MyProxyFactory.getProxy(dog);
        proxy.run();
    }
}
