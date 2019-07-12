package com.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
public class JdbcProperties {
    String driverClassName;
    String url;
    String username;
    String password;
}
