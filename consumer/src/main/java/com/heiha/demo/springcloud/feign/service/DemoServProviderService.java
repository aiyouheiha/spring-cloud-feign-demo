package com.heiha.demo.springcloud.feign.service;

import com.heiha.demo.springcloud.config.DemoServConfig;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/2 11:11<br>
 * <b>Author:</b> Asher<br>
 */
@FeignClient(value = "demoservice", configuration = DemoServConfig.class)
public interface DemoServProviderService {
    @RequestLine("GET /ip")
    String demoIp();

    @RequestLine("GET /info")
    ResponseEntity<String> demoInfo();
}
