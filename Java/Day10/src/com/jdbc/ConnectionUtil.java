package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection con = null;
		// Load the driver class.
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			  con = DriverManager.getConnection(url,"scott","tiger");
			  System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
