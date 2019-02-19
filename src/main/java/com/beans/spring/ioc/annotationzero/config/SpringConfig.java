package com.beans.spring.ioc.annotationzero.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="com.beans.spring.ioc.annotationzero")
@Import(value={JdbcProperties.class})
public class SpringConfig {

}
