/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-25 19:29 创建
 */
package com.zhongxun.study.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@FeignClient(name = "compute-service", fallback = ComputeClientHystrix.class)
//@RequestMapping("/compute")
public interface ComputeClient {

    @RequestMapping("/compute/add")
    Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
