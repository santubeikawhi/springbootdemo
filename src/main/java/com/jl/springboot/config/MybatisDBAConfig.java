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
 * @ClassName MybatisDBAConfig
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/30 16:15
 * @Version 1.0
 */
@Configuration
@MapperScan(basePackages = {"com.jl.springboot.mapperDbprimary"}, sqlSessionFactoryRef = "sqlSessionFactoryPrimary")
public class MybatisDBAConfig {
    @Autowired
    private DataSource primaryDataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactoryPrimary() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(primaryDataSource);
        return sqlSessionFactoryBean.getObject();
    }

    public SqlSessionTemplate sqlSessionTemplatePrimary() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactoryPrimary());
        return sqlSessionTemplate;
    }
}
