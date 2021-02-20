package com.clearlove;

import com.clearlove.service.HelloService;
import com.clearlove.service.impl.HelloServiceImpl;
import com.clearlove.service.impl.HelloServiceImpl2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//    HelloService service = new HelloServiceImpl();
//    service.sayHello("张三");

    //使用反射机制执行sayHello方法。 核心Method(类中的方法)
    HelloService target = new HelloServiceImpl();
    //获取sayHello名称对应的Method类对象
    Method method = HelloService.class.getMethod("sayHello", String.class);
    method.setAccessible(true);
    //通过Method可以执行sayHello方法调用
    /*
    invoke是Method类中的一个方法。表示执行方法的调用
    参数1：Object，表示对象的，要执行这个对象的方法
    参数2：Object...args,方法执行时的参数值
    返回值：Object：方法执行后的返回值
     */
    //表达的意思就是执行target对象sayHello方法，参数是明凯
    HelloService service = new HelloServiceImpl2();
    Object ret = method.invoke(service, "明凯");
  }

}
