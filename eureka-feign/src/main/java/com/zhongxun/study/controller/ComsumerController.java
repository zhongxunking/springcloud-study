/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 19:31 创建
 */
package com.zhongxun.study.controller;

import com.zhongxun.study.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/consumer/feign")
public class ComsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping("/add")
    public Integer add() {
        return computeClient.add(50, 60);
    }

}
