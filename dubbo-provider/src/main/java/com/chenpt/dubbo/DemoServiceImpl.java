package com.chenpt.dubbo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chen
 * @Description: 具体接口实现
 * @Date: created in 2018/9/20
 * @Modified By:
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "I from provider："+name;
    }
}
