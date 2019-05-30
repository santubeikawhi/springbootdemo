package com.jl.springboot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName MybatisDBBConfig
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/30 16:31
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = {"com.jl.springboot.mapperDbSecondary"}, sqlSessionFactoryRef = "sqlSessionFactorySecondary")
public class MybatisDBBConfig {
    @Autowired
    private DataSource secondDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactorySecondary() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(secondDataSource);
        return  sqlSessionFactoryBean.getObject();
    }

    public SqlSessionTemplate sqlSessionTemplateSecondary() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactorySecondary());
        return  sqlSessionTemplate;
    }
}
