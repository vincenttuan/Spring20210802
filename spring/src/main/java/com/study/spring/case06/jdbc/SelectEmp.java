package com.study.spring.case06.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectEmp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		String sql = "select eid, ename, age, createtime from emp";
		List<Map<String, Object>> emps = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> emp : emps) {
			//System.out.println(emp);
			System.out.println(emp.get("ename"));
		}
	}

}
