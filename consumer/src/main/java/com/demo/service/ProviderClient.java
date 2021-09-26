package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author AoDeng
 * @date 10:10 21-9-26
 */
@FeignClient(value = "provider")
public interface ProviderClient {

    @GetMapping("getInfo")
    String getInfo(@RequestParam(value = "name",defaultValue = "nacosConfig",required = false)String name);
}

