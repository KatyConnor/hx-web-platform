package com.hx.spring.boot.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mingliang
 * @Date 2018-07-13 16:01
 */
@RestController
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.hx.spring.boot.platform","hx.spring.framework.dynamic.datasource"})
//@MapperScan(basePackages = {"com.hx.spring.boot.platform.dal.dao"})
public class PlatformApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(PlatformApplication.class,args);
        System.out.println("启动耗时："+(System.currentTimeMillis() - startTime)/1000+" s");
    }

    @GetMapping("/test")
    public String testa(){
        return "http2 tests";
    }
}
