package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {

     // Load the driver class.
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		  Connection con = DriverManager.getConnection(url,"scott","tiger");
		  System.out.println("Connection established");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
