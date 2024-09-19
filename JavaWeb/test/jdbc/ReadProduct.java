package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadProduct {
	public static void main(String[] args) throws Exception {
		// 1.建立 Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.建立連線 Connection
		String username = "root";
		String password = "12345678";
		String dbUrl = "jdbc:mysql://localhost:3306/web?serverTimezone=Asia/Taipei";
		Connection conn = DriverManager.getConnection(username, password, dbUrl);
		// 3.建立敘述句 Statement
		Statement stmt = conn.createStatement();
		// 4.設定 sql 查詢語句
		String sql = "select product_id, product_name, price, qty from product";
		// 5.進行查詢並得到 ResultSet 結果
		ResultSet rs = stmt.executeQuery(sql);
		// 6.資料利用 while(rs.next()) 逐筆呈現
		while(rs.next()) {
			String productName = rs.getString("product_name");
			System.out.println(productName);
		}
	}

}
