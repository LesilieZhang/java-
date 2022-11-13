package com.zhang;

import com.zhang.shangjia.Taobao;
import com.zhang.shangjia.Weishang;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Customer.java
 * @Description 客户买U盘的行为
 * @createTime 2022年11月12日 19:36:00
 */
public class Customer {
    public static void main(String[] args) {
//        Taobao taobao=new Taobao();//创建商家的对象
//        float price=taobao.sell(1);//客户买多少个
//        System.out.println("通过淘宝的商家，购买U盘的单价："+price);

        Weishang weishang=new Weishang();
        float price=weishang.sell(5);
        System.out.println("买五个U盘的价格："+price);
    }
}
