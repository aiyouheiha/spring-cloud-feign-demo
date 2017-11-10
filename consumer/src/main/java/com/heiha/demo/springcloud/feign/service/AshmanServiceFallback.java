package com.heiha.demo.springcloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * <br>
 * <b>Project:</b> spring-cloud-feign-demo<br>
 * <b>Date:</b> 2017/11/10 11:34<br>
 * <b>Author:</b> Asher<br>
 */
@Component
public class AshmanServiceFallback implements AshmanService {
    @Override
    public String list() {
        return "ashman list";
    }

    @Override
    public String get(String ashmanId) {
        return "ashman";
    }
}
