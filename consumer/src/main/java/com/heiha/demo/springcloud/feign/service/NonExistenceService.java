package com.heiha.demo.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/10 11:16<br>
 * <b>Author:</b> Asher<br>
 */
@FeignClient(name = "non-existence", fallbackFactory = NonExistenceServiceFallbackFactory.class)
public interface NonExistenceService {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}


