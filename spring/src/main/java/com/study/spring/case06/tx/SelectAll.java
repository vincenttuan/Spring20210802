package com.study.spring.case06.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectAll {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		String sql = "select * from book";
		System.out.println(jdbcTemplate.queryForList(sql));
		sql = "select * from stock";
		System.out.println(jdbcTemplate.queryForList(sql));
		sql = "select * from wallet";
		System.out.println(jdbcTemplate.queryForList(sql));
		
	}
}
