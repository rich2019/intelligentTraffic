package com.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 配置文件类
 * @Configuration,声明一个类作为配置类,代替xml文件
 * @bean注解,声明在方法上,将方法的返回值加入bean容器,代替<bean>标签
 * @value,属性注入
 * @propertySource,指定外部属性文件
 */

@Configuration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();

    }
}
