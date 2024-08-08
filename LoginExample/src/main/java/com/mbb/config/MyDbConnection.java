package com.mbb.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnection {
	private static Connection con; 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded...");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			System.out.println("Connected....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getDbConnection() {
		return con;
	}
}
