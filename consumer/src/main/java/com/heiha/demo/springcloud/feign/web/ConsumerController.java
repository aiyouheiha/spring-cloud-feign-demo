package com.heiha.demo.springcloud.feign.web;

import com.heiha.demo.springcloud.feign.api.DemoService;
import com.heiha.demo.springcloud.feign.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/9/4 14:36<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
@RequestMapping("/v1/consumer")
public class ConsumerController {
    @Autowired
    private ProviderService providerService;

    @GetMapping
    public String get() {
        return providerService.get();
    }

    @GetMapping("/{value}")
    public String getValue(@PathVariable String value) {
        return providerService.getValue(value);
    }
}
