package com.clearlove.store;

import com.clearlove.factory.UsbKingFactory;
import com.clearlove.service.UsbSell;

/**
 * @author promise
 * @date 2020/9/23 - 21:51
 */
public class WeiShang implements UsbSell {
    //代理的是金士顿，定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price+=1;
        return price;
    }
}
