package com.heiha.demo.springcloud.feign.service;

import com.heiha.demo.springcloud.config.ProviderConfig;
import com.heiha.demo.springcloud.feign.api.DemoService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/9/4 14:41<br>
 * <b>Author:</b> heiha<br>
 */
@FeignClient(value = "springcloud-feign-demo-provider", configuration = ProviderConfig.class)
public interface ProviderService extends DemoService {
}
