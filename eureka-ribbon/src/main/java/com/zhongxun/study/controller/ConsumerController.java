/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 16:32 创建
 */
package com.zhongxun.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@RestController
@RequestMapping("/consumer/ribbon")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public Integer add() {
        ResponseEntity<Integer> responseEntity = restTemplate.getForEntity("http://compute-service/compute/add?a=10&b=20", Integer.class);
        return responseEntity.getBody();
    }

}
