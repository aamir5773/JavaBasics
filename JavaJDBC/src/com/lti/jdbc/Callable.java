package com.lti.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Callable {
	
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
		 
		 Connection  conn=DriverManager.getConnection(url,"hr","hr");
		PreparedStatement pstmt = null;
		 
		 if (conn != null) 
		 {	
			    System.out.println("Connected");
		 }
		
		try
		 {
		 CallableStatement cstmt1 = conn.prepareCall("{call getProductName (?, ?)}");
		 cstmt1.setInt(1,101);
		 cstmt1.registerOutParameter(2, java.sql.Types.VARCHAR);
		 cstmt1.executeUpdate();
		 String userName = cstmt1.getString(2);
		 System.out.println(userName);
		 }
		 
		 catch (SQLException e)
		 {
		 System.out.println(e.getMessage());
		 }
		 finally
		 {
			 conn.close();
		 }
	}

}
