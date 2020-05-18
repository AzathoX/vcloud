package org.vcloud.dmsys.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "vcloud.dmsys")
@Data
public class DmsysConfig {
    private String dependOnUri;
}
