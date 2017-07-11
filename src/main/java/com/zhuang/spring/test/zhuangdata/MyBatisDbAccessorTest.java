package com.zhuang.spring.test.zhuangdata;
import org.junit.Test;

import com.zhuang.data.DbAccessor;
import com.zhuang.data.mybatis.MyBatisDbAccessor;
import com.zhuang.spring.utils.ApplicationContextUtil;

public class MyBatisDbAccessorTest {

	@Test
	public void test() {
		DbAccessor dbAccessor=ApplicationContextUtil.GetApplicationContext().getBean(MyBatisDbAccessor.class);
	
		System.out.println(dbAccessor);
	}
	
}
