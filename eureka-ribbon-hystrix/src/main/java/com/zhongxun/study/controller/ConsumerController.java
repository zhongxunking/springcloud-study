/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 16:32 创建
 */
package com.zhongxun.study.controller;

import com.zhongxun.study.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/consumer/ribbon")
public class ConsumerController {
    @Autowired
    private ComputeService computeService;

    @RequestMapping("/add")
    public Integer add() {
        return computeService.add();
    }

}
