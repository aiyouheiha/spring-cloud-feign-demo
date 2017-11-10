package com.heiha.demo.springcloud.feign.web;

import com.heiha.demo.springcloud.feign.api.DemoService;
import com.heiha.demo.springcloud.feign.service.AshmanService;
import com.heiha.demo.springcloud.feign.service.DemoServProviderService;
import com.heiha.demo.springcloud.feign.service.NonExistenceService;
import com.heiha.demo.springcloud.feign.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @Autowired
    private DemoServProviderService demoServProviderService;

    @Autowired
    private AshmanService ashmanService;

    @Autowired
    private NonExistenceService nonExistenceService;

    @GetMapping
    public String get() throws InterruptedException {
        return providerService.get();
    }

    @GetMapping("/{value}")
    public String getValue(@PathVariable String value) {
        return providerService.getValue(value);
    }

    @GetMapping("/ip")
    public String demoIp() {
        return demoServProviderService.demoIp();
    }

    @GetMapping("/info")
    public ResponseEntity<String> demoInfo() {
        return demoServProviderService.demoInfo();
    }

    @GetMapping("/ashman")
    public ResponseEntity<String> ashmanList() {
        return ResponseEntity.ok(ashmanService.list());
    }

    @GetMapping("/ashman/{ashmanId}")
    public ResponseEntity<String> ashman(@PathVariable String ashmanId) {
        return ResponseEntity.ok(ashmanService.get(ashmanId));
    }

    @GetMapping("/hello")
    public String hello() {
        return nonExistenceService.hello();
    }
}
