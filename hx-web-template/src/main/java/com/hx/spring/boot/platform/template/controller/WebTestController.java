package com.hx.spring.boot.platform.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mingliang
 * @Date 2018-07-14 22:04
 */
@Controller
@RequestMapping("/test")
public class WebTestController {

    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    public String test(){
        return "rule/home";
    }
}
