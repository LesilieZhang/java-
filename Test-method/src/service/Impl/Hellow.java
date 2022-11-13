package service.Impl;

import service.HelloService;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Hellow.java
 * @Description TODO
 * @createTime 2022年11月12日 22:19:00
 */
public class Hellow implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello==="+name);
    }
}
