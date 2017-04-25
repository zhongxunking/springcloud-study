/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 14:32 创建
 */
package com.zhongxun.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/compute")
public class ComputeController {
    private static final Logger logger = LoggerFactory.getLogger(ComputeController.class);

    @RequestMapping("/add")
    public Integer add(Integer a, Integer b) {
        logger.info("收到请求ComputeController.add");
        return a + b;
    }

}
