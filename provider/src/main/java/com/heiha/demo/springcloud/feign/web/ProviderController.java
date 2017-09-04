package com.heiha.demo.springcloud.feign.web;

import com.heiha.demo.springcloud.feign.api.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/9/4 13:44<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
public class ProviderController implements DemoService {
    @Override
    public String get() {
        return "This is a demo";
    }

    @Override
    public String getValue(@PathVariable String value) {
        return value;
    }

}
