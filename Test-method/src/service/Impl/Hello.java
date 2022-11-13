package service.Impl;

import service.HelloService;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Hello.java
 * @Description TODO
 * @createTime 2022年11月12日 20:33:00
 */
public class Hello implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好"+name);
    }
}
