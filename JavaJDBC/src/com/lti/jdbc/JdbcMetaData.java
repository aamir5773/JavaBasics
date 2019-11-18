package com.lti.jdbc;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcMetaData {
	
	public static void main(String[] args) throws SQLException {
		
	String url = "jdbc:oracle:thin:@localhost:1522:XE";	// orcl or XE 
			Connection  conn=DriverManager.getConnection(url,"SYSTEM","Ritwik123");
		
		Statement stmt = null;
		 PreparedStatement pstmt=null;
		 if (conn != null) 
		 {
			    System.out.println("Connected");
			    
		 }
		 try
		 {
			 	  stmt = (Statement) conn.createStatement();
			      String query = "select * from Products";
			      ResultSet rs = stmt.executeQuery(query);
			      
			      ResultSetMetaData rsmd = rs.getMetaData();
			     
			   			     			      
			      System.out.println("no of columns in the table= "+      rsmd.getColumnCount());
			      System.out.println("Name of the first column "+        rsmd.getColumnName(1));
			      System.out.println("Type of the second column "+       rsmd.getColumnTypeName(2));
			      System.out.println("No of characters in 3rd column "+       rsmd.getColumnDisplaySize(2));
			      	
			      DatabaseMetaData dma = conn.getMetaData();
			      
							System.out.println("n  connected to "+ dma.getURL());
							System.out.println(" driver "+ dma.getDriverName());
							System.out.println(" version "+ dma.getDatabaseProductName());  
			                System.out.println(" version "+ dma.getUserName()); 
		 }
		 catch(SQLException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 finally
			{
				try
				{	
				conn.close();}
				catch(Exception e)
				{System.out.println(e);}
			}		
}
}
