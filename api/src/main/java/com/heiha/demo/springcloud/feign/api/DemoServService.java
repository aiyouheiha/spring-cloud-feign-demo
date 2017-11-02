package com.heiha.demo.springcloud.feign.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/2 11:08<br>
 * <b>Author:</b> Asher<br>
 */
public interface DemoServService {
    @GetMapping("/ip")
    String demoIp();

    @GetMapping("/info")
    ResponseEntity<String> demoInfo();
}
