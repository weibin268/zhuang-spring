package com.zhuang.spring;

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
    }
}
