package com.foreveross.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Dbutil {// 构造方法
	private Dbutil() {
	}

	static {
		try {
		//	Class.forName("com.mysql.jdbc.Driver");// jdbc
			Class.forName("oracle.jdbc.driver.OracleDriver");// oracle
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} // 加载驱动程序);

	}

	public static Connection getConn() {
		Connection conn = null;
		try {
		//	conn = DriverManager.getConnection("jdbc:mysql://172.20.70.72:8066/macula3", "root", "qwer1234");// url+用户+密码
		//	conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/macula3", "root", "password");// url+用户+密码
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ERCDEV", "ERCDEV");// oracle
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public static PreparedStatement getPstmt(Connection conn, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	public static ResultSet getRs(PreparedStatement pstmt) {
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			rs = null;
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			stmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			conn = null;
		}

	}

}