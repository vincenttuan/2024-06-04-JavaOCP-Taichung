package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	private static Connection conn;
	
	static {
		try {
			// 1.建立 Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2.建立連線 Connection
			String username = "root";
			String password = "12345678";
			String dbUrl = "jdbc:mysql://localhost:3306/web?serverTimezone=Asia/Taipei";
			conn = DriverManager.getConnection(dbUrl, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
