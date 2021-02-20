package com.clearlove;

import com.clearlove.store.TaoBao;
import com.clearlove.store.WeiShang;

/**
 * @author promise
 * @date 2020/9/23 - 21:37
 */
public class ShopMain {
    public static void main(String[] args) {
        //创建代理的商家TaoBao对象
//        TaoBao taoBao = new TaoBao();
        //通过代理类，实现购买U盘，增加了优惠券，红包等等
//        float price = taoBao.sell(1);
//        System.out.println("通过淘宝的商家，购买U盘单价："+price);

        WeiShang weiShang = new WeiShang();
        //通过代理类，实现购买U盘，增加了优惠券，红包等等
        float price = weiShang.sell(1);
        System.out.println("通过微商购买的价格："+price);

    }
}
