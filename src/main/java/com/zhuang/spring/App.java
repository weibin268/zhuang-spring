package com.zhuang.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.zhuang.spring.test.Father;
import com.zhuang.spring.test.TestService;
import com.zhuang.spring.utils.ApplicationContextUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Father fa = ApplicationContextUtil.GetApplicationContext().getBean("father",Father.class);
    	fa.driveCar();

    	TestService testService = ApplicationContextUtil.GetApplicationContext().getBean("testService",TestService.class);
    	
    	testService.delTest();
    }
}
