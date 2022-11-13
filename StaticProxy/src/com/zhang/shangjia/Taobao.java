package com.zhang.shangjia;

import com.zhang.factory.UsbKingFactory;
import com.zhang.service.UsbSell;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Taobao.java
 * @Description taobao是一个商家，代理金士顿U盘的销售
 * @createTime 2022年11月12日 19:32:00
 */
public class Taobao implements UsbSell {

    //声明 商家代理的厂家是谁
    private UsbSell factory=new UsbKingFactory();
    /**
     * 实行销售功能
     * @param amount 数量
     * @return
     */
    @Override
    public float sell(int amount) {
        //向厂家发送订单，告诉厂家，我卖了U盘，厂家要发货
        float price=factory.sell(amount);//返回的是厂家的价格
        //商家需要加价：中间商赚差价，假设利润25
        price=price+25;
        System.out.println("淘宝给你返了一个红包");
        return price;
    }
}
