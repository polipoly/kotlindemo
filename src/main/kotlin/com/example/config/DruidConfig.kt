package com.example.config

import com.alibaba.druid.pool.DruidDataSource
import com.alibaba.druid.support.http.StatViewServlet
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    fun druid(): DataSource{
        return DruidDataSource()
    }

    @Bean
    fun statViewServlet(): ServletRegistrationBean<StatViewServlet> {
        var bean: ServletRegistrationBean<StatViewServlet> =ServletRegistrationBean(StatViewServlet(),"/druid/*");

        return bean;
    }

}