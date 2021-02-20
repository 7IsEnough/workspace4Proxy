package com.clearlove;

import com.clearlove.handle.MyInvocationHandler;
import com.clearlove.service.GongNeng;
import com.clearlove.service.HelloService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {

  public static void main(String[] args) {
    GongNeng gn = new GongNeng();
//    int num = gn.print("销售");
//    System.out.println("num="+num);

    InvocationHandler invocationHandler = new MyInvocationHandler(gn);

    HelloService proxy = (HelloService) Proxy.newProxyInstance(gn.getClass().getClassLoader(),
        gn.getClass().getInterfaces(), invocationHandler);

    int result = proxy.print("销售");
    System.out.println(result);


  }
}
