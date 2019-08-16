package com.hand.configserver.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author fu.ji@hand-china.com 2019/08/16 17:33
 */
@RestController
@RequestMapping("v1")
public class ConfigController {
    @Value("${test.config}")
    private String config;

    @GetMapping("config")
    public String queryConfig(){
        return "config is "+config;
    }
}
