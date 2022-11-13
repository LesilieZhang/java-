package com.zhang.factory;

import com.zhang.service.UsbSell;


public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //一个128G的U盘是85元
        //后期根据数量调整价格
        return 85f;
    }
}
