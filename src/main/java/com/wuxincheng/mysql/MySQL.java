package com.wuxincheng.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySQL {
	
	private static Logger logger = LoggerFactory.getLogger(MySQL.class);

	public Connection getConnection(){
		logger.info("MySQL数据库连接");
		
		Connection con = null; //定义一个MYSQL链接对象
        try {
        	logger.info("MySQL数据库正在连接中... ...1");
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			logger.info("MySQL数据库正在连接中... ...2");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wuxincheng", "root", "123456"); // 链接本地MYSQL

			logger.info("MySQL数据库已连接");
		} catch (InstantiationException e) {
			logger.error("MySQL数据库连接异常(InstantiationException)", e);
		} catch (IllegalAccessException e) {
			logger.error("MySQL数据库连接异常(IllegalAccessException)", e);
		} catch (ClassNotFoundException e) {
			logger.error("MySQL数据库连接异常(ClassNotFoundException)", e);
		} catch (SQLException e) {
			logger.error("MySQL数据库连接异常(SQLException)", e);
		}
		
		return con;
	}
	
}
