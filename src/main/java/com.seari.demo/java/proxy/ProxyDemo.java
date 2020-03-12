package com.seari.demo.java.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        IDog dog = new GunDog();
        IDog proxy = (IDog)MyProxyFactory.getProxy(dog);
        proxy.run();
    }
}
