/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 21:52 创建
 */
package com.zhongxun.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Service
public class ComputeService {
    @Autowired
    private RestTemplate restTemplate;

    public Integer add() {
        return restTemplate.getForEntity("http://compute-service/compute/add?a=10&b=20", Integer.class).getBody();
    }

}
