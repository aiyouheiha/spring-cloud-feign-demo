package com.heiha.demo.springcloud.feign.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/9/4 13:37<br>
 * <b>Author:</b> heiha<br>
 */
@RequestMapping("/v1/demo")
public interface DemoService {
    @GetMapping
    String get() throws InterruptedException;

    @GetMapping("/{value}")
    String getValue(@PathVariable("value") String value);
}
