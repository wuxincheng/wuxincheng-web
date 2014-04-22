package com.wuxincheng.web.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wuxincheng.mysql.MySQL;

/**
 * 测试
 * 
 * @author wuxincheng
 *
 */
@Controller
@RequestMapping("/mysql")
public class MySQLController {

	private static Logger logger = LoggerFactory.getLogger(MySQLController.class);

	@RequestMapping(value = "/test")
	public String execute(Model model) {
		logger.info("MySQL test");
		
		MySQL mysql = new MySQL();
		
		Connection conn = mysql.getConnection();
		
		try {
			conn.close();
		} catch (SQLException e) {
			logger.error("关于MYSQL异常", e);
		}
		
		logger.info("测试完成");
		
		return "mysql/test";
	}

}
