package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableDemo {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionUtil.getConnection();
			CallableStatement cstmt = con.prepareCall("{call DeleteEmployee(?)}");
			cstmt.setInt(1, 1);
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
