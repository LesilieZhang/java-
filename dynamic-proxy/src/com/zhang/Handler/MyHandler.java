package com.zhang.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName MyHandler.java
 * @Description 必须事先InvocationHandler接口完成代理类要做的功能（1、调用目标方法 2.功能增强）
 * @createTime 2022年11月12日 23:22:00
 */
public class MyHandler implements InvocationHandler {
    /**target就是目标对象**/
    private Object target=null;
    //动态代理：目标对象是活动的不是固定的。需要传入进来
    //传入的是谁，就给谁创建代理。
    public MyHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        向厂家发送订单，告诉厂家，我卖了U盘，厂家要发货
//        float price=factory.sell(amount);//返回的是厂家的价格
//        //商家需要加价：中间商赚差价，假设利润25
//        price=price+25;
//        System.out.println("淘宝给你返了一个红包");
//        return price;
        //以上是静态代理实现的

        //动态代理如何实现？
        Object ret=null;//返回值
        ret=method.invoke(target,args);//执行目标方法
        //功能增强
        if(ret!=null){
            Float price=(Float) ret;
            price=price+25;
            ret=price;
        }
        System.out.println("淘宝给你返了一个红包");
        return ret;
    }
}
