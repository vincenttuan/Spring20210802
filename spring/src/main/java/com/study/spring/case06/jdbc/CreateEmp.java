package com.study.spring.case06.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateEmp {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
	JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
	
	@Test
	public void test() {
		case1();
	}
	
	public void case1() {
		String sql = "Insert into emp(ename, age) values(?, ?)";
		jdbcTemplate.update(sql, "Jo", 21);
		System.out.println("Insert ok 1");
	}
	
	public void case2() {
		
	}
	
	public void case3() {
		
	}
	
}
