package com.itheima.datasource.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;

/**
 * 自定义连接池的测试类
 * @author jack
 *
 */
public class DataSourceDemo1 {
	
	/**
	 * 
	 */
	@Test
	/**
	 * 测试自定义连接池
	 */
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MyDataSource dataSource = null;
		try {
			//获得连接
			//conn = JDBCUtils.getConnection();
			//从连接池中获得连接
			dataSource = new MyDataSource();
			conn = dataSource.getConnection();
			//编写SQL语句
			String sql = "select * from account ";
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数
			//执行SQL
			rs = pstmt.executeQuery();
			//遍历结果集
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("money"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//JDBCUtils.release(rs,pstmt, conn);
			if(rs != null) {	
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}
			//不销毁连接，归还连接	
			dataSource.addBack(conn);	
			}	
		}		
	}

}
