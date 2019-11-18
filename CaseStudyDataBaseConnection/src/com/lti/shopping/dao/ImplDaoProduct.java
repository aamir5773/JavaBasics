package com.lti.shopping.dao;

import java.awt.List;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lti.shopping.entity1.Product1;

public class ImplDaoProduct implements IDaoProduct {

	@Override
	public void addProduct(Product1 p) {
		System.out.println("Calling addProduct()......inside dao");
		System.out.println(p);
		
		List<Product1> myList= new ArrayList<>();
		
		try{
			String url = "jdbc:oracle:thin:scott@//localhost:1521/XE";
			 
			 Connection  conn=DriverManager.getConnection(url,"HR","HR");
			
			 PreparedStatement pstmt = conn.prepareStatement("Insert into Products(pid,pName,price) values(?,?,?)"
			 		);
			 pstmt.setInt(1, p.getPrdid());
			 pstmt.setFloat(2, p.getPrdCost());
			 pstmt.setNString(3, p.getPrdName());
			 
			 int i= pstmt.executeUpdate();
			 System.out.println(i + "Record Added");
			 
			 
			 Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery("Select * from Products");
				
				while (rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					float cost = rs.getFloat(3);
					Product p = new Product(id, name, cost);
					myList.add(p);
			 
			 
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

	@Override
	public List<Product1> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
