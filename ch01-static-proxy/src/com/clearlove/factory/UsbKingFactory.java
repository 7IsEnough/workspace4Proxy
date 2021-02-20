package com.clearlove.factory;

import com.clearlove.service.UsbSell;

/**
 * 目标类：金士顿厂家,不接受用户的单独购买
 * @author promise
 * @date 2020/9/23 - 21:27
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //一个128G的U盘是85元
        //后期可以根据amount，可以实现不同的价格，例如10000个，单价是80，50000个75
        return 85.0f;
    }
}
