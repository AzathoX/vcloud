package org.vcloud.dmsys.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"org.nrocn.friday.config","org.nrocn.user","org.vcloud.config"})
@EnableFeignClients(basePackages = "org.vcloud.dmsys.services.feign")
@EnableJpaRepositories(basePackages = "org.vcloud.dmsys.dao")
@MapperScan("org.vcloud.dmsys.mapper")
public class AppConfig {
}
