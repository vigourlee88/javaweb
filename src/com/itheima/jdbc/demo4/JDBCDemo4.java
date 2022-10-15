package com.itheima.jdbc.demo4;

import org.junit.Test;

/**
 * SQL注入的漏洞
 * @author jack
 *
 */
public class JDBCDemo4 {
	@Test
	/**
	 * SQL注入漏洞的演示
	 */
	public void demo1() {
		UserDao userDao = new UserDao();
//		boolean flag = userDao.login("aaa","123");
//		boolean flag = userDao.login("aaa' or '1=1","12345");
		boolean flag = userDao.login("aaa' -- ","12345");
		if(flag) {
			System.out.println("登录成功!");
		}else {
			System.out.println("登录失败!");
		}
	}

}
