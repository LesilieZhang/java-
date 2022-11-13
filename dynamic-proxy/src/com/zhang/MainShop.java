package com.zhang;
import com.zhang.Handler.MyHandler;
import com.zhang.factory.UsbKingFactory;
import com.zhang.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName MainShop.java
 * @Description TODO
 * @createTime 2022年11月12日 23:30:00
 */
 class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1、创建目标对象
        UsbSell factory = new UsbKingFactory();
        //2  创建invocationHandler对象
        InvocationHandler handler = new MyHandler(factory);
        //3创建代理对象
        UsbSell proxy = (UsbSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), handler);
        //4通过代理执行方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象调用方法：" + price);
    }
}
