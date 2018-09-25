package com.chenpt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: chen
 * @Description:
 * @Date: created in 2018/9/20
 * @Modified By:
 */
public class Provider {
    private static Logger logger = LoggerFactory.getLogger(Provider.class);

    public static void main(String[] args) throws IOException {
        logger.info("=========================================================================================");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        logger.info("************************here:{}",context.getDisplayName()+"*************************************");
        context.start();
        logger.info("provider服务已启动······");
        System.in.read();

    }
}
