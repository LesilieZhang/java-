package com.zhang.service.Handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName MyInvocationHandeler.java
 * @Description TODO
 * @createTime 2022年11月13日 15:24:00
 */
public class MyInvocationHandeler implements InvocationHandler {
    private Object target;

    public MyInvocationHandeler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用目标方法
        Object res=method.invoke(target,args);
        //需要翻倍的结果
        if(res!=null){
            Integer num= (Integer) res;
            res=num*2;
        }
        return res;
    }
}
