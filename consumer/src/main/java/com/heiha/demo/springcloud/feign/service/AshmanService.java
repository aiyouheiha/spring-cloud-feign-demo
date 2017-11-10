package com.heiha.demo.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/9 10:31<br>
 * <b>Author:</b> Asher<br>
 */
@FeignClient(name = "ashman", url = "http://sinfonia.top:10084/", fallback = AshmanServiceFallback.class)
public interface AshmanService {
    @GetMapping("/v1/ashman")
    String list();

    @GetMapping("/v1/ashman/{ashmanId}")
    String get(@PathVariable("ashmanId") String ashmanId);
}
