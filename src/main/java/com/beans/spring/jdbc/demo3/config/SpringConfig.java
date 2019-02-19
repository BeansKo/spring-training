package com.beans.spring.jdbc.demo3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="com.beans.spring.jdbc.demo3")
@Import(JdbcConfig.class)
public class SpringConfig {

}
