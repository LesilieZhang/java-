package com.zhang.shangjia;

import com.zhang.factory.UsbKingFactory;
import com.zhang.service.UsbSell;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Weishang.java
 * @Description 微商类
 * @createTime 2022年11月12日 19:45:00
 */
public class Weishang implements UsbSell {
    //声明 商家代理的厂家是谁
    private UsbSell factory=new UsbKingFactory();

    @Override
    public float sell(int amount) {
        float price=factory.sell(amount);
        //只增加1元
        price=price+1;
        return price;
    }
}
