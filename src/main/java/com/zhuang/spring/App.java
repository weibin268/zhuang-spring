package com.zhuang.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zhuang.spring.test.Father;
import com.zhuang.spring.utils.ApplicationContextUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Father fa = ApplicationContextUtil.GetApplicationContext().getBean("father",Father.class);
    	fa.driveCar();

    	JdbcTemplate jdbcTemplate = ApplicationContextUtil.GetApplicationContext().getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	List<Map<String,Object>> map = jdbcTemplate.queryForList("select * from sys_autocode");
    
    	System.out.println(map);
    }
}
