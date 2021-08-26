package com.example.springaopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.springaopdemo")
@EnableAspectJAutoProxy(exposeProxy = true)
public class AOPConfig {

}
