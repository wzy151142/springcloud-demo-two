package com.jk.controller;

import com.jk.service.UserFeignService;
import com.jk.service.UserService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author wzy
 * @Date @Time $ $
 */
@Controller
@RefreshScope
@RequestMapping("user")
public class UserController {

    @RequestMapping("abc")
    @ResponseBody
    private  String abc(@RequestParam String niubi){

        return niubi;
    }

}
