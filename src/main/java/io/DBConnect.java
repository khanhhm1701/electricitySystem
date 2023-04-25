package io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private String url = "jdbc:mysql://localhost:3306/java";
	private String user = "root";
	private String pass = "12345678";

	private Connection conn;

	public static DBConnect instance = null;
	
	public DBConnect() {
		if (conn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static DBConnect gI() {
		if (instance == null) {
			instance = new DBConnect();
		}
		return instance;
	}
	
	public static Connection getConn() {
		return DBConnect.gI().conn;
	}
	
	


}
