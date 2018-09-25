package com.chenpt.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: chen
 * @Description:  消费者
 * @Date: created in 2018/9/20
 * @Modified By:
 */
public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        context.start();
        System.out.println("consumer start······");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.sayHello("玛利亚"));
    }

}
