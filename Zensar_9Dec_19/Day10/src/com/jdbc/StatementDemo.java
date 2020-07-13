package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		try {
			Connection  con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("Employee Id:"+rs.getInt("Emp_Id"));
				System.out.println("Employee Name:"+rs.getString(2));
				System.out.println("Salary:"+rs.getInt(3));
			}
            int i = stmt.executeUpdate("insert into employee values(34,'Manu',54564)");
            System.out.println("No of Records get affected:"+i);
            
            
            PreparedStatement pstmt = con.prepareStatement("update employee set sal =? where emp_id=?");
            pstmt.setInt(1, 23456);
            pstmt.setInt(2, 1);
            int res  = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
