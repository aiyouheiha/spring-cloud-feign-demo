package com.heiha.demo.springcloud.feign.service;

import com.heiha.demo.springcloud.feign.api.DemoServService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/2 11:11<br>
 * <b>Author:</b> Asher<br>
 */
@FeignClient("demoservice")
public interface DemoServProviderService extends DemoServService {
}
