/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 14:32 创建
 */
package com.zhongxun.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/compute")
public class ComputeController {

    @RequestMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
