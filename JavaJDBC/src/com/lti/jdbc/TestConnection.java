package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection 
{
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		
	String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
	 
	 Connection  conn=DriverManager.getConnection(url,"hr","hr");
	
	 if (conn != null) 
	 {
		    System.out.println("Connected");
	 }
	 try
	 {
	 Statement stmt = conn.createStatement();
	 ResultSet rs = stmt.executeQuery("Select * from Products");
	 
	 while (rs.next())
	 {
		 int id = rs.getInt("prdId");
		 String name = rs.getString(2);   //2 indicates 2nd column
		 float cost = rs.getFloat(3);
		 
		 System.out.println("\t" + id +" " +name + "\t" + cost + "\n");
	 }
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

