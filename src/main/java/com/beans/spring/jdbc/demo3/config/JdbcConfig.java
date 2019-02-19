package com.beans.spring.jdbc.demo3.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@PropertySource(value="classpath:jdbc.properties")
@EnableTransactionManagement //代替<tx:annotation-driven transaction-manager="transactionManager"/>
public class JdbcConfig {
	@Value("${url}")
	private String url;
	
	@Value("${driver}")
	private String driverClass;
	
	@Value("${user}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean(value="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSrouce = new DriverManagerDataSource();
		dataSrouce.setDriverClassName(driverClass);
		dataSrouce.setUrl(url);
		dataSrouce.setUsername(username);
		dataSrouce.setPassword(password);
		
		return dataSrouce;
	}
	
	@Bean(value="jdbcTemplate")
	public JdbcTemplate geTemplate(@Qualifier(value="dataSource")DataSource dataSource) {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		
		return template;
	}
	
	@Bean(value="transactionManager")
	public DataSourceTransactionManager getTransactionManager(@Qualifier(value="dataSource")DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
