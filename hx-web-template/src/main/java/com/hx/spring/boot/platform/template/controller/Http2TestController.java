package com.hx.spring.boot.platform.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mingliang
 * @Date 2018-08-02 14:17
 */
@RestController
public class Http2TestController {

//    @RequestMapping("/test")
    public String testa(){
        return "http2 tests";
    }
}
