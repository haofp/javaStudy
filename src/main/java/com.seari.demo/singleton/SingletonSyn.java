package com.seari.demo.singleton;

/**
 * 但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，
 * 事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。
 */
public class SingletonSyn {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static Singleton instace = null;

    /**
     * 私有构造方法，防止被实例化
     */
    public static synchronized Singleton getInstance(){
        if(instace == null){
            instace = new Singleton();
        }
        return instace;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve(){
        return instace;
    }
}
