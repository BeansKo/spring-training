package com.beans.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.beans.spring.jdbc.demo1.domain.Account;

public class JdbcDemo {

	public static void main(String[] args) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/mis?useSSL=false");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		jdbcTemplate.setDataSource(dataSource);
		
		//增加
		//jdbcTemplate.update("insert into account (username,money) values (?,?)","lisi",5000);
		
		//修改
		//jdbcTemplate.update("update account set money=? where username=?",4000,"lisi");
		
		//查询
		List<Account> list = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
		System.out.println(list);
		Account account = jdbcTemplate.queryForObject("select * from account where id=1", new BeanPropertyRowMapper<Account>(Account.class));
		System.out.println(account);
	}

}
