package com.jk.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author wzy
 * @Date @Time $ $
 */
@RequestMapping("/error")
@Component
public class UserServiceFallback implements UserFeignService{


    /*public Map findOrderList(Integer page, Integer rows*//*, OrderBean orderBean*//*) {
        System.out.println("熔断处理，方法查询商品列表");
        return null;
    }*/
}
