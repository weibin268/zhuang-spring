package com.zhuang.spring.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestService{

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void delTest(){

		Integer integer = jdbcTemplate.queryForObject("select count(*) from sys_autocodedetail",Integer.class);
	
		System.out.println(integer);
			
		jdbcTemplate.execute("delete from sys_autocodedetail");
		
		throw new RuntimeException("11");
	}
	
	
}
