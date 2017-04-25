/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 16:32 创建
 */
package com.zhongxun.study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@RestController
@RequestMapping("/consumer/ribbon/hystrix")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addErr")
    @RequestMapping("/add")
    public String add() {
        return restTemplate.getForEntity("http://compute-service/compute/add?a=10&b=20", Integer.class).getBody().toString();
    }

    public String addErr() {
        return "调用底层服务出错";
    }

}
