package com.itheima.datasource.demo1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import com.itheima.jdbc.utils.JDBCUtils;
/**
 * 自定义连接池
 * @author jack
 *
 */
public class MyDataSource implements DataSource {
	//将一些连接存入到内存中，可以定义一个集合，用于存储连接对象
	private List<Connection> connList = new ArrayList<Connection>();
	//在初始化的时候提供一些连接
	public MyDataSource() {
		//初始化连接
		for(int i = 1; i <= 3;i++) {
			//向集合中存入连接
			connList.add(JDBCUtils.getConnection());
			
		}
	}
	//从连接池中获得连接的方法
	@Override
	public Connection getConnection() throws SQLException {
		Connection conn= connList.remove(0);
		return conn;
	}
	//编写归还连接的方法
	public void addBack(Connection conn) {
		connList.add(conn);
		
	}


	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}

	
	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
	
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		return 0;
	}

}
