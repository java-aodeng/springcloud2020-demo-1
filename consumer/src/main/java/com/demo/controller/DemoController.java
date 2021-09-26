package com.demo.controller;

import com.demo.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AoDeng
 * @date 10:15 21-9-26
 */
@RestController
public class DemoController {
    @Autowired
    ProviderClient providerClient;

    @GetMapping("getInfoByFeign")
    public String getInfoByFeign(){
        return providerClient.getInfo("consumer feign");
    }
}
