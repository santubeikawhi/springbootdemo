package com.jl.springboot.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @ClassName MybatisConfigFactory 数据源工厂
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/30 11:18
 * @Version 1.0
 */

@Configuration
public class MybatisConfigFactory {

    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primarydatasource")
    public DataSource primaryDataSource(){
        return  new BasicDataSource();
    }

    @Bean(name = "secondDataSource")
    @Qualifier("secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.seconddatasource")
    public DataSource secondDataSource(){
        return new BasicDataSource();
    }
}
