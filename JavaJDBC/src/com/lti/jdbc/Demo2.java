package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
		 
		 Connection  conn=DriverManager.getConnection(url,"hr","hr");
		PreparedStatement pstmt = null;
		
		 if (conn != null) 
		 {
			    System.out.println("Connected");
		 }
		 try
		 {
			 pstmt = conn.prepareStatement("Insert into products values(?,?,?)");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Product Id : ");
			 int pid = sc.nextInt();
			pstmt.setInt(1,pid);
			
			
			pstmt.setString(2, "Gloves");
			
			pstmt.setDouble(3,500.00);
			
			int i = pstmt.executeUpdate();
			System.out.println(i+ "record added");
			
		 }
		 
		 catch (SQLException e)
		 {
		 System.out.println(e);
		 }
		 finally
		 {
			 conn.close();
		 }
		}
		
		
		
		
		
		
		
		
		
		
	}


