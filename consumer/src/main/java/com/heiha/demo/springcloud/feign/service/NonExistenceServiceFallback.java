package com.heiha.demo.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/10 11:23<br>
 * <b>Author:</b> Asher<br>
 */
public class NonExistenceServiceFallback implements NonExistenceService {

    @Override
    public String hello() {
        return "Fallback Hello";
    }
}