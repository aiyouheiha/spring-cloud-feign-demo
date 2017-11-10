package com.heiha.demo.springcloud.feign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/10 14:08<br>
 * <b>Author:</b> Asher<br>
 */
@Component
public class NonExistenceServiceFallbackFactory implements FallbackFactory<NonExistenceService> {
    @Override
    public NonExistenceService create(Throwable throwable) {
        return new NonExistenceServiceFallback();
    }
}
