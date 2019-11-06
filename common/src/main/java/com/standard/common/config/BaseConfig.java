package com.standard.common.config;

import org.redisson.spring.session.config.EnableRedissonHttpSession;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhangH
 * @date: 2019/10/20 22:53
 * @description:
 */
@EnableEurekaClient
@Configuration
@EnableRedissonHttpSession
public class BaseConfig {
}