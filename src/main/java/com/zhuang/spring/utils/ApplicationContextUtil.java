package com.zhuang.spring.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {

	public static ApplicationContext Get4PathXml() {
	
		return new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});
		
	}
	
}
