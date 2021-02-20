package com.clearlove.service;

/**
 * 表示功能的，厂家，商家都要完成的功能
 * @author promise
 * @date 2020/9/23 - 21:22
 */
public interface UsbSell {
    //定义方法 参数amount：表示一次购买的数量，暂时不用
    //返回值表示一个U盘的价格
    float sell(int amount);
}
