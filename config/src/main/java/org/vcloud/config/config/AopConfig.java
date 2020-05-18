package org.vcloud.config.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.vcloud.*.config","org.vcloud.*.aop"})
public class AopConfig {
}
