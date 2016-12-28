package com.zhuang.spring;

import javax.swing.tree.VariableHeightLayoutCache;

import com.zhuang.spring.test.BMWCar;
import com.zhuang.spring.test.Car;
import com.zhuang.spring.utils.ApplicationContextUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Car car = ApplicationContextUtil.Get4PathXml().getBean("car",BMWCar.class);
    	car.run();
    }
}
