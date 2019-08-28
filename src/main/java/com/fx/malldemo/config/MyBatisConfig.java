package com.fx.malldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: mabaofeng
 * @date: 2019/8/28 15:00
 * @description:
 */
@Configuration
@MapperScan(value = "com.fx.malldemo.mbg.mapper")
public class MyBatisConfig {
}
