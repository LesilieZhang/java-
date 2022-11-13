package com.zhang.factory;

import com.zhang.service.UsbSell;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName UsbKingFactory.java
 * @Description TODO
 * @createTime 2022年11月12日 23:18:00
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中，执行sell目标方法");
        return 85f;
    }
}
