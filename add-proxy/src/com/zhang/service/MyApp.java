package com.zhang.service;

import com.zhang.service.Handler.MyInvocationHandeler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName MyApp.java
 * @Description TODO
 * @createTime 2022年11月13日 15:23:00
 */
public class MyApp {
    public static void main(String[] args) {
        Gongneng gongneng=new Gongneng();
        InvocationHandler handler=new MyInvocationHandeler(gongneng);

        HelloService proxy= (HelloService) Proxy.newProxyInstance(gongneng.getClass().getClassLoader(),gongneng.getClass().getInterfaces(),handler);
        int num=proxy.print("市场");
        System.out.println(num);
   }
}
